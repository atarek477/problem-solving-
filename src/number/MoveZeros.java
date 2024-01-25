package number;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int swap=0;
        for (int i = nums.length-1; i > 0 ; i--) {
            for (int j = nums.length-i-1; j >0; j--) {
                if(nums[j-1]==0){
                    swap=nums[j];
                    nums[j-1]=swap;
                    nums[j]=0;



                }


            }
        }

    }

}
