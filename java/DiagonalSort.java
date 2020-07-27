package java;

public class DiagonalSort {
    public int[][] diagonalSort(int[][] mat) {
        for (int row = 0; row < mat.length - 1; row++) {
            for (int col = 0; col < mat[0].length - 1; col++) {
                int i = row;
                int j = col;
                while (++i < mat.length && ++j < mat[0].length) {
                    if (mat[row][col] > mat[i][j]) {
                        int tem = mat[row][col];
                        mat[row][col] = mat[i][j];
                        mat[i][j] = tem;
                    }
                }

            }

        }
        return mat;
    }

}
