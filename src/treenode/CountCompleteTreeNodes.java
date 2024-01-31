package treenode;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {

        if(root==null)
            return 0;

        int left= countNodes(root.left);
        int right= countNodes(root.right);
        return (right+left)+1;





    }
}
