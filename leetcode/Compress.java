package leetcode;

public class Compress {
    public int compress(char[] chars) {
        int t = 0;
        for (int i = 0; i < chars.length; i++) {
            int cnt = 1;
            char c = chars[i];
            while (i + 1 < chars.length && chars[i + 1] == c) {
                i++;
                cnt++;
            }
            chars[t++] = c;
            if (cnt > 1) {
                String s = String.valueOf(cnt);
                for (int j = 0; j < s.length(); j++) {
                    chars[t++] = s.charAt(j);
                }
            }

        }
        return t;

    }

}