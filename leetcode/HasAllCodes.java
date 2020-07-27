package leetcode;

import java.util.Arrays;

public class HasAllCodes {
    boolean res;

    public boolean hasAllCodes(String s, int k) {
        if ((int) Math.pow(2, k) > s.length() - k + 1)
            return false;
        char[] c = new char[k];
        Arrays.fill(c, '0');
        if (!s.contains(new String(c)))
            return false;
        res = true;
        helper(s, c, 0);
        return res;

    }

    public void helper(String s, char[] c, int pos) {
        if (!res)
            return;
        for (int i = pos; i < c.length; i++) {
            c[i] = 1;
            if (!s.contains(new String(c))) {
                res = false;
                return;
            }
            char[] t = new char[c.length];
            for (int j = 0; j < c.length; j++) {
                t[j] = c[j];
            }
            helper(s, t, pos + 1);
            c[i] = 0;

        }
    }

}