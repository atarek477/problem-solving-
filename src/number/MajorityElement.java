package number;

import java.util.HashMap;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hashMap= new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            if (hashMap.containsKey(num) && hashMap.get(num) > nums.length / 2) {
                return num;
            }
        }


return 0;
    }


}
