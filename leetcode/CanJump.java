package leetcode;

public class CanJump {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        dp[n - 1] = true;
        for (int i = n - 2; i >= 0; i--) {
            if (i + nums[i] >= n - 1)
                dp[i] = true;
            else {
                int t = i + nums[i];
                while (t > i)
                    if (dp[t--]) {
                        dp[i] = true;
                        break;
                    }
            }
        }
        return dp[0];
    }

}