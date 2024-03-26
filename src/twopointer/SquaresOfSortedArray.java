package twopointer;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int []result=new int[nums.length];
        int pointer= result.length-1;
        while(left<right){
            if(Math.abs(nums[left])<Math.abs(nums[right])){
              result[pointer]=(int)Math.pow(nums[right],2);
              right--;
              pointer--;


            } else if (Math.abs(nums[left])>Math.abs(nums[right])) {
                result[pointer]=(int)Math.pow(nums[left],2);
                left++;
                pointer--;
            }else{
                result[pointer]=(int)Math.pow(nums[left],2);
                pointer--;
                result[pointer]=(int)Math.pow(nums[left],2);
                left++;
                right--;
                pointer--;
            }


        }





return result;
    }



}
