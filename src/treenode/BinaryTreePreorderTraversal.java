package treenode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        return help(root, list);

    }

    private List<Integer> help(TreeNode root, List<Integer> list) {
        if(root==null)
            return list;


        list.add(root.val);
        help(root.left,list);
        help(root.right,list);

        return list;

    }
}
