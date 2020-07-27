package leetcode;

public class __MinimumDeleteSum {

    public static int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = s1.length() - 1; i >= 0; i--) {
        }
        for (int i = s2.length(); i >= 0; i--) {
        }
        for (int i = s1.length() - 1; i >= 0; i--) {
            for (int j = s2.length(); j >= 0; j--) {
            }

        }
        return dp[0][0];

    }

    public static void main(String... args) {
        System.out.println(minimumDeleteSum("leetcode", "let"));

    }

}