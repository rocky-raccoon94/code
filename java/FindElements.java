package java;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import dependences.TreeNode;

public class FindElements {
    private Set<Integer> set;

    public FindElements(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        set = new HashSet<>();
        root.val = 0;
        set.add(0);
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode n = queue.remove();
            set.add(n.val);
            if (n.left != null) {
                n.left.val = 2 * n.val + 1;
                queue.add(n.left);
            }
            if (n.right != null) {
                n.right.val = 2 * n.val + 2;
                queue.add(n.right);
            }
        }
    }

    public boolean find(int target) {
        return set.contains(target);
    }

}