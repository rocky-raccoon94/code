package leetcode;

public class MaximumSwap {
    public int maximumSwap(int num) {
        char[] c = String.valueOf(num).toCharArray();
        for (int i = 0; i < c.length; i++) {
            int pos = i;
            char res = c[i];
            for (int j = i + 1; j < c.length; j++) {
                if (c[j] > res) {
                    pos = j;
                    res = c[j];
                }
            }
            if (pos != i) {
                var tem = c[pos];
                c[pos] = c[i];
                c[i] = tem;
                return Integer.parseInt(new String(c));
            }

        }
        return num;
    }

}