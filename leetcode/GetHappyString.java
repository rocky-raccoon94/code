package leetcode;

public class GetHappyString {
    private String[] set;
    String res;

    private int size;

    public String getHappyString(int n, int k) {
        size = 0;
        set = new String[] { "a", "b", "c" };
        backtrack("", n, k, "");
        res = "";
        return res;

    }

    public void backtrack(String s, int n, int k, String t) {
        if (!res.equals(""))
            return;
        if (s.length() == n) {
            if (++size == k)
                res = s;
            return;
        }
        for (String alpha : set) {
            if (!t.equals(alpha))
                backtrack(s + alpha, n, k, alpha);
        }

    }

}