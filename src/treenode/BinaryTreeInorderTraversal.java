package treenode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        return help(root, list);

    }

    private List<Integer> help(TreeNode root, List<Integer> list) {
       if(root==null)
           return list;

        help(root.left,list);
        list.add(root.val);
        help(root.right,list);

        return list;

    }
}
