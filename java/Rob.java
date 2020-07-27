package java;

public class Rob {
    public int rob(int[] nums) {
        if (nums == null)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int len = nums.length;
        return Math.max(money(nums, 0, len - 1), money(nums, 1, len));
    }

    public int money(int[] nums, int l, int r) {
        int res = 0, pre = 0, cur = 0;
        for (int i = l; i < r; i++) {
            res = Math.max(res, nums[i] + pre);
            pre = cur;
            cur = res;
        }
        return res;
    }

}