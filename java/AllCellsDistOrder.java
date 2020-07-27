package java;

public class AllCellsDistOrder {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R * C][2];
        int k = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                res[k][0] = i;
                res[k][1] = j;
                k++;
            }
        }
        qsort(res, 0, res.length - 1, r0, c0);
        return res;

    }

    public void qsort(int[][] x, int l, int r, int r0, int c0) {
        if (l >= r)
            return;
        int m = l;
        int t = Math.abs(x[l][0] - r0) + Math.abs(x[r][1] - c0);
        for (int i = l + 1; i <= r; i++) {
            if (t > Math.abs(x[i][0] - r0) + Math.abs(x[i][1] - c0))
                swap(x, ++m, i);
        }
        swap(x, m, l);

    }

    public void swap(int[][] x, int i, int j) {
        int[] t = x[i];
        x[i] = x[j];
        x[j] = t;
    }

}