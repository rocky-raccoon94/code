package java;

import java.util.ArrayList;
import java.util.List;

public class CheckIfPrerequisite {
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        List<Boolean> res = new ArrayList<>();
        boolean[][] grid = new boolean[n][n];
        for (int[] pre : prerequisites) {
            grid[pre[0]][pre[1]] = true;
            for (int i = 0; i < n; i++) {
                if (grid[i][pre[0]])
                    grid[i][pre[1]] = true;
            }
        }
        for (int[] pre : queries) {
            if (grid[pre[0]][pre[1]])
                res.add(true);
            else
                res.add(false);
        }
        return res;

    }

}