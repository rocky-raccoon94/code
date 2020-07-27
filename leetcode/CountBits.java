package leetcode;

public class CountBits {
    public int[] countBits(int num) {
        if (num == 0)
            return new int[] { 0 };
        int[] dp = new int[num];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < num; i++) {
            if ((i & 1) != 0)
                dp[i] = dp[i - 1] + 1;
            else {
                int t = i;
                while ((t & 1) == 0)
                    t >>= 1;
                dp[i] = dp[t];
            }

        }
        return dp;
    }

}