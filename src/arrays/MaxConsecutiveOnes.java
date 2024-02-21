package arrays;

import java.util.Arrays;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int result=0 ;
        int count =0;

        for (int num : nums) {
            if (num ==1) {
               count= count+1;

            } else {
                if (count > result) {
                    result = count;
                }
                count = 0;
            }

        }
        if (count > result) {
            result = count;
        }

return result;
    }

}
