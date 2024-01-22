package treenode;

public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int h = 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0 || right == 0) {
            h = Math.max(left, right);
        } else {
            h = Math.min(left, right);
        }

        return h + 1;


    }

}
