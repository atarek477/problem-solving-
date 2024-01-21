package treenode;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true ;
        if(p==null||q==null)
            return false ;

        boolean b1=isSameTree(p.right,q.right);
        boolean b2=isSameTree(p.left,q.left);
        return (p.val==q.val)&&b1&&b2;

    }
}
