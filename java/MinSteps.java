package java;

public class MinSteps {
    public int minSteps(String s, String t) {
        int n = s.length();
        int[] sa = new int[n];
        int[] ta = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            sa[s.charAt(i) - '0']++;
            ta[t.charAt(i) - '0']++;
        }
        for (int i = 0; i < n; i++) {
            if (sa[i] > ta[i])
                res += sa[i] - ta[i];
        }
        return res;

    }

}