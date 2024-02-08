package arrays;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.isEmpty() || !hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], i);
            } else {
                if (i - hashMap.get(nums[i]) <= k) {
                    return true;
                }
                hashMap.put(nums[i], i);
            }

        }
        return false;
    }
}
