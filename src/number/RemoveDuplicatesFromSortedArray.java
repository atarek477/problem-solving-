package number;

import java.util.Stack;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int count=0;
        for (int i = 1; i < nums.length; i++) {

            if ( nums[count] != nums[i]) {
                count++;
                nums[count]=nums[i];
            }

        }
        return count+1;

    }




}
