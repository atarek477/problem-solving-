package problems;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        return   help(0,nums.length-1,nums,target);




    }

    private int help(int i, int i1, int[] nums, int target) {


        if (nums[i]>=target)
            return i;


        if (nums[i1]<=target)
            return Integer.compare(target,nums[i1])+i1;

        if (nums[i1/2]==target)
            return i1/2;




        if (nums[i1/2]>target)
            return help(i,(i1/2)-1,nums,target);
        else{
            return help((i1/2)+1,(i1)-1,nums,target);
        }




    }


}
