package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

   //not optimal
    public boolean containsDuplicate1(int[] nums) {

       nums= Arrays.stream(nums).sorted().toArray();
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]==nums[i+1]){
            return true;
            }
        }






    return false;
    }

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seen = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i]))
                return true;

            seen.add(nums[i]);
        }
        return false;
    }

}
