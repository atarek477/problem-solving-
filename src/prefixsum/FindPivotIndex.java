package prefixsum;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {



        int []prefix= new int[nums.length];
        int []postfix= new int[nums.length];
        int count = postfix.length-2;
        prefix[0]=0;
        postfix[ postfix.length-1]=0;
        for (int i = 1; i <nums.length ; i++) {
            prefix[i]=prefix[i-1]+nums[i-1];
            postfix[count]=postfix[count+1]+nums[count+1];
            count--;
        }
        for (int i = 0; i <prefix.length ; i++) {
            if (postfix[i]==prefix[i])
                return i;


        }



        return -1;
    }

}
