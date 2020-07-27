package leetcode;

class FindPoisonedDuration {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int t = timeSeries[i + 1] - timeSeries[i];
            if (t > duration)
                ans += duration;
            else
                ans += t;
        }
        return ans+duration;

    }
}