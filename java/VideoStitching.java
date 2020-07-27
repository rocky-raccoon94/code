package java;

import java.util.Arrays;

public class VideoStitching {
    public int videoStitching(int[][] clips, int T) {
        int cnt = 0;
        Arrays.sort(clips, (x, y) -> {
            if (x[0] != y[0])
                return x[0] - y[0];
            else
                return x[1] - y[1];
        });
        int start = 0, end = 0;
        for (int i = 0; i < clips.length; i++) {
            boolean m = false;
            cnt++;
            if (start < clips[i][0])
                return -1;
            while (i < clips.length && clips[i][0] <= start) {
                m = true;
                end = Math.max(end, clips[i][1]);
                if (end >= T)
                    return cnt;
                i++;
            }
            if (m)
                i--;
            start = end;
        }
        return -1;

    }

}