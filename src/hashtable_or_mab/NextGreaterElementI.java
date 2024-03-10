package hashtable_or_mab;

import java.util.HashMap;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int flag = 0;
        for (int j : nums1) {
            hashMap.put(j, j);
        }
        for (int i = 0; i < nums2.length; i++) {
            int count = i;
            if (hashMap.containsKey(nums2[i])) {

                while (count != nums2.length - 1) {
                    if ((nums2[i] < nums2[count + 1])) {
                        hashMap.put(hashMap.get(nums2[i]), nums2[count + 1]);
                        flag = 1;
                        break;
                    }

                    count++;
                }
                if (flag == 0) {
                    hashMap.put(hashMap.get(nums2[i]), -1);
                }
                flag = 0;
            }
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = hashMap.get(nums1[i]);
        }
        return result;
    }
}
