package leetcode;

public class GetKth {
    public static int getKth(int lo, int hi, int k) {
        int[] dp = new int[hi + 1];
        int[] res = new int[hi + 1];
        for (int i = lo; i <= hi; i++) {
            res[i] = i;
            dp[i] = power(i, 0);
        }
        for (int i = lo; i <= hi; i++) {
            for (int j = i + 1; j <= hi; j++) {
                if (dp[i] == dp[j]) {
                    if (res[i] > res[j])
                        swap(res, i, j);
                }
                if (dp[i] > dp[j]) {
                    swap(res, i, j);
                    swap(dp, i, j);
                }
            }
            System.out.println(dp[i] + "----" + res[i]);
        }

        return res[k + lo - 1];

    }

    public static void swap(int[] x, int a, int b) {
        int t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    public static int power(int n, int res) {
        if (n == 1)
            return res;
        if (n % 2 == 0)
            n /= 2;
        else
            n = n * 3 + 1;
        return power(n, res + 1);
    }

    public static void main(String... args) {
        getKth(1, 1000, 153);
    }

}