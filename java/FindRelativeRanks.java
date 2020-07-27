package java;
public class FindRelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        int n = nums.length;
        String[] res = new String[n];
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            rank[i] = i;
        }
        qsort(nums, rank, 0, n - 1);
        res[rank[0]] = "Gold Medal";
        if (n > 1)
            res[rank[1]] = "Silver Medal";
        if (n > 2)
            res[rank[2]] = "Bronze Medal";
        for (int i = 3; i < n; i++) {
            res[rank[i]] = String.valueOf(i + 1);
        }
        return res;

    }

    public void qsort(int[] nums, int[] rank, int l, int r) {
        if (r <= l)
            return;
        int m = l;
        int t = nums[l];
        for (int j = l + 1; j <= r; j++) {
            if (t < nums[j]) {
                swap(nums, ++m, j);
                swap(rank, m, j);
            }
        }
        swap(nums, l, m);
        swap(rank, l, m);
        qsort(nums, rank, l, m - 1);
        qsort(nums, rank, m + 1, r);

    }

    public void swap(int[] x, int a, int b) {
        int t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

}