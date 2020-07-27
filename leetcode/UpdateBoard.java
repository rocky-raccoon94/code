package leetcode;

public class UpdateBoard {
    public char[][] updateBoard(char[][] board, int[] click) {
        int a = click[0];
        int b = click[1];

        if (board[a][b] == 'M') {
            board[a][b] = 'X';
        }
        sweep(board, click[0], click[1]);

        return board;
    }

    public void sweep(char[][] board, int a, int b) {
        if (a < 0 || a >= board.length || b < 0 || b >= board[0].length)
            return;
        char c = board[a][b];
        if (c == 'M' || c == 'B' || Character.isDigit(c))
            return;
        int mines = 0;
        int x1 = Math.max(a - 1, 0);
        int y1 = Math.min(a + 1, board.length - 1);
        int x2 = Math.max(b - 1, 0);
        int y2 = Math.min(b + 1, board[0].length - 1);
        for (int i = x1; i <= y1; i++) {
            for (int j = x2; j <= y2; j++) {
                if (board[i][j] == 'M')
                    mines++;
            }
        }
        if (mines > 0)
            board[a][b] = (char) (mines + '0');
        else {
            board[a][b] = 'B';
            sweep(board, a - 1, b);
            sweep(board, a + 1, b);
            sweep(board, a - 1, b - 1);
            sweep(board, a - 1, b + 1);
            sweep(board, a + 1, b - 1);
            sweep(board, a + 1, b + 1);
            sweep(board, a, b - 1);
            sweep(board, a, b + 1);
        }
    }

}