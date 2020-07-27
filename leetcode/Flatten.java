package leetcode;

import dependences.TreeNode;

public class Flatten {
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.left);
        if (root.left != null) {
            TreeNode tem = root.left;
            while (tem.right != null)
                tem = tem.right;
            tem.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        flatten(root.right);
    }

}