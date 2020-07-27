package leetcode;


public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int cnt = 1;
            int t = i;
            while (nums[t] != i) {
                t = nums[t];
                cnt++;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}