package java;

public class NumberOfArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        if (A.length == 0)
            return 0;
        int[] diffs = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++) {
            diffs[i] = A[i + 1] - A[i];
        }
        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < diffs.length - 1; i++) {
            if (diffs[i + 1] == diffs[i])
                ans += ++cnt;
            else
                cnt = 0;
        }
        return ans;

    }

}