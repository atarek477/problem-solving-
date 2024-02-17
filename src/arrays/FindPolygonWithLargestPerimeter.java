package arrays;

import java.util.Arrays;

public class FindPolygonWithLargestPerimeter {

    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int count=nums.length-1;
        long sum = 0;
        for (int i = 0; i < nums.length ; i++) {
            sum=sum+nums[i];
        }
        sum=sum-nums[count];

        while(count>0&&nums[count]>=sum) {
            count--;

            sum=sum-nums[count];


        }
        System.out.println(sum+" "+count);

        return (count>1)?(sum+nums[count]):-1;

    }
}
