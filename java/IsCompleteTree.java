package java;

import java.util.LinkedList;
import java.util.Queue;

import dependences.TreeNode;

public class IsCompleteTree {
    public boolean isCompleteTree(TreeNode root) {
        int nullcnt = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (nullcnt > 0)
                return false;
            if (node == null)
                nullcnt++;
            else {
                queue.add(node.left);
                queue.add(node.right);
            }

        }
        return true;

    }

}