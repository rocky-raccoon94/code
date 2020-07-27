package leetcode;

import java.util.List;

public class ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
        String[] s = sentence.split("\\s");
        dict.sort((x, y) -> x.length() - y.length());
        StringBuilder builder = new StringBuilder();
        boolean[] hasRoot = new boolean[s.length];
        for (int i = 0; i < s.length; i++) {
            for (String root : dict) {
                if (s[i].startsWith(root)) {
                    builder.append(root);
                    hasRoot[i] = true;
                    break;
                }
            }
            if (!hasRoot[i])
                builder.append(s[i]);
            if (i != s.length - 1)
                builder.append("\\s");
        }
        return builder.toString();
    }

}