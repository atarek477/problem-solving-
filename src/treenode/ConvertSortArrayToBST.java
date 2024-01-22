package treenode;

public class ConvertSortArrayToBST {

    public static TreeNode sortedArrayToBST(int[] nums) {
        return convertArray(nums,0,nums.length-1);



    }

    public static TreeNode convertArray(int [] nums,int first,int end) {
        if (first > end)return null;

        int mid = (first+end)/2;
        TreeNode t= new TreeNode(nums[mid]);
      t.left = convertArray(nums,first,mid-1);
      t.right= convertArray(nums,mid+1,end);
      return t;

    }



}
