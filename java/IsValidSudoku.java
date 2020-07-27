package java;

import java.util.HashSet;
import java.util.Set;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                char d = board[j][i];
                if (row.contains(c) || col.contains(d))
                    return false;
                if (c != '.')
                    row.add(c);
                if (d != '.')
                    col.add(d);

            }

        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                Set<Character> set = new HashSet<>();
                for (int a = i; a < i + 3; a++) {
                    for (int b = j; b < j + 3; b++) {
                        char c = board[a][b];
                        if (c == '.')
                            continue;
                        if (set.contains(c))
                            return false;
                        set.add(c);
                    }
                }

            }
        }
        return true;
    }
}