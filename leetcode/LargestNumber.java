package leetcode;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        StringBuilder builder = new StringBuilder();
        qsort(nums, 0, nums.length - 1);
        for (int num : nums)
            builder.append(num);
        return builder.toString();

    }

    public void qsort(int[] x, int l, int r) {
        if (l >= r)
            return;
        int m = l;
        int t = x[l];
        for (int i = l; i <= r; i++) {
            if (largerThan(x[i], t)) {
                swap(x, ++m, i);
            }
        }
        swap(x, m, l);
        qsort(x, l, m - 1);
        qsort(x, m + 1, r);
    }

    public void swap(int[] x, int a, int b) {
        int tem = x[a];
        x[a] = x[b];
        x[b] = tem;
    }

    public boolean largerThan(int n1, int n2) {
        StringBuilder t1 = new StringBuilder().append(n1).append(n2);
        StringBuilder t2 = new StringBuilder().append(n2).append(n1);
        return t1.compareTo(t2) > 0;

    }

}