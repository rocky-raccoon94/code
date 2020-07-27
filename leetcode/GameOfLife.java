package leetcode;

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int r = board.length;
        int c = board[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int x1 = Math.max(0, i - 1);
                int y1 = Math.min(i + 1, r - 1);
                int x2 = Math.max(0, j - 1);
                int y2 = Math.min(j + 1, c - 1);
                int t = 0;
                for (int a = x1; a <= y1; a++) {
                    for (int b = x2; b <= y2; b++) {
                        t += board[a][b];
                    }
                }
                t -= board[i][j];
                System.out.println(t);
                if (t == 3 || (t == 2 && board[i][j] == 1))
                    res[i][j] = 1;
            }
        }
        for (int i = 0; i <= r; i++) {
            for (int b = 0; b <= c; b++) {
                board[i][b] = res[i][b];
            }
        }

    }

}