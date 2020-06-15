package leetcode;

public class SmallestRangeI {
    public int smallestRangeI(int[] A, int k) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int a : A) {
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        return Math.max(max - min - k, 0);
    }

}