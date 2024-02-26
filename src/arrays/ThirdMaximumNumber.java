package arrays;

import java.util.Arrays;
import java.util.Stack;

public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {

        Stack<Integer>stack= new Stack<>();
        Arrays.sort(nums);
        int count=0;

        for (int i = nums.length-1; i >=0&&count<3 ; i--) {

            if(stack.isEmpty()||stack.peek()!=nums[i]){
                System.out.println(nums[i]);
                stack.push(nums[i]);
                count++;
            }

        }

        if(count!=3)
            return nums[nums.length-1];

        return stack.peek();
    }


}
