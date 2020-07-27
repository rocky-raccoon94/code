package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class IsBipartite {

    public boolean isBipartite(int[][] graph) {

        int[] colors = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (colors[i] == 0) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                colors[i] = 1;
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    for (int adjacent : graph[node]) {
                        if (colors[adjacent] == colors[node])
                            return false;
                        else if (colors[adjacent] == 0) {
                            queue.add(adjacent);
                            colors[adjacent] = -colors[node];
                        }
                    }
                }
            }
        }
        return true;
    }
}