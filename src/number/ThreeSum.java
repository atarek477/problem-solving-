package number;

import java.util.*;
import java.util.stream.IntStream;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set= new HashSet<>();
        List<Integer>list= new ArrayList<>();
        Arrays.sort(nums);
        int sum =0;
        for (int i = 0; i <nums.length; i++) {
            int left =i+1;
            int right=nums.length-1;



            while (left<right)
            {  sum= nums[i]+nums[left]+nums[right];
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;

                } else if (sum<0) {
                    left++;

                }else {
                    right--;

                }


            }

        }

        return new ArrayList<>(set) ;
    }



}
