package arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
     int []prefix=new int[nums.length];
     int []postfix=new int[nums.length];
     prefix[0]=1;
     postfix[nums.length-1]=1;
     int count =nums.length-2;
        for (int i = 1; i <nums.length ; i++) {

            prefix[i]=prefix[i-1]*nums[i-1];
            postfix[count]=postfix[i+1]*nums[i+1];
            count--;



        }
        for (int i = 0; i <prefix.length ; i++) {
            nums[i]=prefix[i]*postfix[i];
        }


     return nums;

    }



}
