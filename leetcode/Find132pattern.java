package leetcode;

public class Find132pattern {
    public boolean find132pattern(int[] nums) {
        for (int i = nums.length - 1; i >= 2; i--) {
            int m = nums[i];
            int r = i - 1;
            while (r > 0 && nums[r] <= m)
                r--;
            int l = r - 1;
            while (l >= 0 && nums[l] >= m)
                l--;
            if (l >= 0)
                return true;
        }
        return false;
    }

}