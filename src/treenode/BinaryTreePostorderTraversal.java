package treenode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {



        List<Integer> list = new ArrayList<>();
        return help(root, list);

    }

    private List<Integer> help(TreeNode root, List<Integer> list) {
        if(root==null)
            return list;



        help(root.left,list);
        help(root.right,list);
        list.add(root.val);
        return list;

    }

}
