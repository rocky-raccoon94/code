package java;

public class WinGame {
    public static boolean winGame(int leap, int[] game) {
        return dfs(0, leap, game, new boolean[game.length]);

    }

    public static boolean dfs(int pos, int leap, int[] game, boolean[] visited) {
        if (pos >= game.length)
            return true;
        else if (pos < 0 || game[pos] == 1 || visited[pos])
            return false;
        visited[pos] = true;
        boolean back = dfs(pos - 1, leap, game, visited);
        return dfs(pos + 1, leap, game, visited) || dfs(pos + leap, leap, game, visited) || back;
    }

}