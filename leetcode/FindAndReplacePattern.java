package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int len = pattern.length();
        char[] ch = pattern.toCharArray();
        
        List<String> res = new ArrayList<>();
        for (String word : words) {
            Map<Character, Character> map = new HashMap<>();
            Set<Character> set = new HashSet<>();
            int i;
            for (i = 0; i < len; i++) {
                char c = word.charAt(i);
                if (!map.containsKey(ch[i])) {
                    if (set.contains(c))
                        break;
                    map.put(ch[i], c);
                    set.add(c);
                } else if (map.get(ch[i]) != c)
                    break;
            }
            if (i == len)
                res.add(word);
        }
        return res;

    }

}