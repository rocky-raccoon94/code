package java;

class MinFallingPathSum {

    public int minFallingPathSum(int[][] A) {
        int n = A.length;
        for (int r = 1; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int min = A[r - 1][c];
                if (c > 0)
                    min = Math.min(min, A[r - 1][c - 1]);
                if (c < n - 1)
                    min = Math.min(min, A[r - 1][c + 1]);
                A[r][c] += min;

            }
        }
        int res = Integer.MAX_VALUE;
        for (int a : A[n - 1])
            res = Math.min(res, a);
        return res;

    }

}