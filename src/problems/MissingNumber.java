package problems;

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber1(int[] nums) {

        int [] nums1= Arrays.stream(nums).sorted().toArray();
        for (int i = 0; i <nums1.length-1 ; i++) {
            if(nums1[i]+1!=nums1[i+1]){
                return nums1[i]+1;
            }

        }
        if(nums1[0]==1)
            return 0;
        return nums1[nums1.length-1]+1;
    }






}
