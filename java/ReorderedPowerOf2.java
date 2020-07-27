package java;

public class ReorderedPowerOf2 {
    public boolean reorderedPowerOf2(int N) {
        String s = String.valueOf(N);
        int i = 1;
        for (int t = 0; t < 32; t++) {
            if (isEqual(String.valueOf(i << t), s))
                return true;
        }
        return false;

    }

    public boolean isEqual(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int n = s1.length();
        char[] ch1 = new char[26];
        char[] ch2 = new char[26];
        for (int i = 0; i < n; i++) {
            ch1[s1.charAt(i) - 'a']++;
            ch2[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (ch1[i] != ch2[i])
                return false;
        }
        return true;

    }

}