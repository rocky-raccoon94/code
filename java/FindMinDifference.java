package java;

import java.util.Arrays;
import java.util.List;

public class FindMinDifference {
    public int findMinDifference(List<String> timePoints) {
        int[] time = new int[timePoints.size()];
        int i = 0;
        int res = Integer.MAX_VALUE;
        for (String s : timePoints) {
            time[i++] = transform(s);
        }
        Arrays.sort(time);
        for (int k = 0; k < time.length ; k++) {
            for (int u = 0; u < time.length; u++) {
                int diff = time[u] - time[k];
                diff = Math.min(diff, 1440 - diff);
                res = Math.min(diff, res);
            }
        }
        return res;
    }

    public int transform(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }

}