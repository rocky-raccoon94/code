package java;

import dependences.TreeNode;

public class DistributeCoins {
    private int ans;

    public int distributeCoins(TreeNode root) {
        ans = 0;
        helper(root);
        return ans;
    }

    // res[1] is debt and res[2] is remain;
    public int helper(TreeNode node) {
        if (node == null)
            return 0;
        int L = helper(node.left);
        int R = helper(node.right);
        ans += Math.abs(L) + Math.abs(R);
        return L + R + node.val - 1;

    }

}