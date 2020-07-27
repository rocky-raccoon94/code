package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        int[] t = new int[10];
        for (int i = 1; i <= 9; i++) {
            t[i] = i;
        }

        int digits = 0;
        int len = String.valueOf(low).length();
        while (len <= 9) {
            int start = 1;
            while (start + len <= 10) {
                for (int i = 0; i < len; i++) {
                    digits = digits * 10 + t[start + i];
                }
                if (digits > high)
                    return res;
                if (digits >= low)
                    res.add(digits);
                start++;
                digits = 0;
            }
            len++;
        }
        return res;

    }

}