package leetcode;

public class IsGoodArray {
    public boolean isGoodArray(int[] nums) {
        int t = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (gcd(nums[i], t) == 1)
                return true;
            t = Math.min(nums[i], t);
        }
        return false;

    }

    public int gcd(int a, int b) {
        if (a < b)
            return gcd(b, a);
        return a % b == 0 ? b : gcd(b, a % b);
    }

}