package java;

//Union find

public class NumIslands {
    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    spread(grid, i, j);
                }
            }
        }
        return res;

    }

    public void spread(char[][] grid, int i, int j) {
        if (grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        if (i > 0)
            spread(grid, i - 1, j);
        if (i < grid.length - 1)
            spread(grid, i + 1, j);
        if (j > 0)
            spread(grid, i, j - 1);
        if (j < grid[0].length)
            spread(grid, i, j + 1);

    }

}