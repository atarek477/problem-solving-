package hairandtortoise;

public class FindTheDuplicateNumber {

    public int findDuplicate1(int[] nums) {

        while(nums[0]!=nums[nums[0]]){
            int next = nums[0];
            nums[0]=nums[nums[0]];
            nums[nums[0]]=next;
        }
return nums[0];

    }


    public int findDuplicate(int[] nums) {

      int slow=0,fast=0;
      do{
          fast=nums[nums[fast]];
          slow=nums[slow];


      }while (slow!=fast);

      slow=0;
      while (slow!=fast){

          slow=nums[nums[fast]];
          fast=nums[slow];


      }
return slow;
    }

}
