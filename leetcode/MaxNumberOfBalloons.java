package leetcode;

import java.util.Set;

class MaxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        Set<Character> set = Set.of('b', 'a', 'l', 'o', 'n');
        int[] alpha = new int[26];
        for (int i = 0; i < text.length(); i++) {
            alpha[text.charAt(i) - 'a']++;
        }
        int res = 0;
        for (Character c : set) {
            int t = alpha[c - 'a'];
            if (c == 'l' || c == 'o')
                t /= 2;
            res = Math.min(t, res);
        }
        return res;

    }
}