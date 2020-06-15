package leetcode;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class RemoveKdigits {
    public static String removeKdigits(String nums, int k) {
        if (nums.length() == k)
            return "0";
        if (k == 0)
            return nums;
        int n = nums.length();
        if (nums.charAt(1) == '0') {
            int i = 1;
            while (++i < n && nums.charAt(i) - '0' == 0)
                ;
            return removeKdigits(nums.substring(i), k - 1);
        }
        for (int j = 0; j < n; j++) {
            if (j == n - 1 || nums.charAt(j) - '0' > nums.charAt(j + 1) - '0') {
                return removeKdigits(nums.substring(0, j) + nums.substring(j + 1), k - 1);
            }
        }
        return "";

    }

    public static void main(String... args) {
        Logger logger = System.getLogger("log");
        var start = System.currentTimeMillis();
        logger.log(Level.INFO, removeKdigits("112", 1));
        var end = System.currentTimeMillis() - start;
        logger.log(Level.INFO, end);

    }
}