package twopointer;

import java.util.HashMap;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {

        int count =0;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {

            if (!hashMap.containsKey(k-nums[i]))
            {
                hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
              //  count++;
            }else{

                hashMap.put(k-nums[i],hashMap.getOrDefault(k-nums[i],0)-1);

                if (hashMap.get(k-nums[i])==0)
                    hashMap.remove(k-nums[i]);


                count++;
            }



        }



return count;

    }
}
