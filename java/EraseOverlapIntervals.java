package java;
import java.util.Arrays;

public class EraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0)
            return 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int res = intervals[0][1];
        int cur = Integer.MIN_VALUE;
        for (int i = 1; i < intervals.length; i++) {
            int t = intervals[i][1];
            if (cur > intervals[i][0]) {
                res++;
                cur = Math.min(cur, t);
            } else
                cur = t;
        }
        return res;
    }

}