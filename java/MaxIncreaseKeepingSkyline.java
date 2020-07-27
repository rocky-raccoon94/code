package java;
public class MaxIncreaseKeepingSkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int[] row = new int[x];
        int[] col = new int[y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int t = grid[i][j];
                row[i] = Math.max(row[i], t);
                col[j] = Math.max(col[j], t);
            }
        }
        int res = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                res += Math.min(row[i], col[j]) - grid[i][j];
            }
        }
        return res;

    }

}