package java;

import java.util.ArrayList;
import java.util.List;

public class AllPathsSourceTarget {
    List<List<Integer>> res;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        res = new ArrayList<>();
        List<Integer> t = new ArrayList<>();
        t.add(0);
        path(graph, t, 0);
        return res;
    }

    public void path(int[][] graph, List<Integer> list, int pos) {
        if (graph[pos].length == 0) {
            if (list.get(list.size() - 1) == graph.length - 1)
                res.add(list);
            return;
        }
        for (int t : graph[pos]) {
            List<Integer> tem = new ArrayList<>(list);
            tem.add(t);
            path(graph, tem, t);
        }
    }
}