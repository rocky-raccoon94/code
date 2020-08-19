package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinCostTickets {
    private Set<Integer> set;
    private Integer[] memo;
    private int[] costs;

    public int minCostTickets(int[] days, int[] costs) {
        this.costs = Arrays.copyOf(costs, costs.length);
        memo = new Integer[366];
        set = new HashSet<>();
        for (int day : days)
            set.add(day);
        return dp(1);

    }

    public int dp(int i) {
        if (i > 365)
            return 0;
        if (memo[i] != null)
            return memo[i];
        int ans;
        if (set.contains(i)) {
            ans = Math.min(dp(i + 1) + costs[0], dp(i + 7) + costs[1]);
            ans = Math.min(ans, dp(i + 30) + costs[2]);
        } else
            ans = dp(i + 1);
        memo[i] = ans;
        return ans;
    }

}
