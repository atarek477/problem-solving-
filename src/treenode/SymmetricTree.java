package treenode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
  return Symmetry(root,root);

    }

    private boolean Symmetry(TreeNode root, TreeNode root1) {
        if (root==null&&root1==null)
            return true;
        if (root==null||root1==null)
            return false;
        return (root.val== root1.val)&&(Symmetry(root.left, root1.right))&&(Symmetry(root.left, root1.right))&&(Symmetry(root.right, root1.left));

    }

}
