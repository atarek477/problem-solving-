package treenode;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        return recPathSum(root, targetSum, root.val);



    }

    public boolean recPathSum(TreeNode t1, int targetSum, int currentSum ){
        boolean flag1 = false, flag2 = false;
        if(t1.left==null&&t1.right==null && currentSum == targetSum)
            return true;

        if(t1.right!=null) flag1= recPathSum(t1.right, targetSum, currentSum+t1.right.val);
        if(t1.left!=null)flag2= recPathSum(t1.left, targetSum, currentSum+t1.left.val);

        return  flag1 || flag2;
    }


}
