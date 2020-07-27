package java;

import java.util.Stack;

import dependences.TreeNode;

public class BSTIterator {
    private Stack<Integer> stack;

    public BSTIterator(TreeNode root) {
        initialize(root);

    }

    public int next() {
        return stack.pop();

    }

    public boolean hasNext() {
        return stack.isEmpty();

    }

    public void initialize(TreeNode root) {
        if (root == null)
            return;
        initialize(root.right);
        stack.push(root.val);
        initialize(root.left);
    }

}