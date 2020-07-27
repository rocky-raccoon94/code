package java;

public class MatrixBlockSum {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int x = mat.length;
        int y = mat[0].length;
        int[][] ans = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int x1 = Math.max(i - K, 0);
                int y1 = Math.min(x - 1, i + K);
                int x2 = Math.max(j - K, 0);
                int y2 = Math.min(j + K, y - 1);
                for (int a = x1; a <= y1; a++) {
                    for (int b = x2; b <= y2; b++) {
                        ans[i][j] += mat[a][b];
                    }
                }
            }
        }
        return ans;
    }

}