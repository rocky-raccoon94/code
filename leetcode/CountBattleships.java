package leetcode;

public class CountBattleships {
    public int countBattleships(char[][] board) {
        int res = 0;
        int row = board.length;
        int col = board[0].length;
        boolean[][] v = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (v[i][j])
                    continue;
                if (board[i][j] == 'X') {
                    res++;
                    int a = i;
                    int b = j;
                    while (++a < row && board[a][j] == 'X')
                        v[a][j] = true;
                    while (++b < row && board[i][b] == 'X')
                        v[i][b] = true;
                }
            }
        }
        return res;
    }

}