package leetcode;

public class IntegerReplacement {
    public int integerReplacement(int n) {
        return helper(n, 0);

    }

    public int helper(int n, int res) {
        if (n == 1)
            return res;
        else if (n % 2 == 0)
            return helper(n / 2, res + 1);
        else
            return Math.min(helper(n + 1, res + 1), helper(n - 1, res + 1));
    }

}