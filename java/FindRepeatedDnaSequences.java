package java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i + 10 <= s.length(); i++) {
            var t = s.substring(i, i + 10);
            if (!map.containsKey(t))
                map.put(t, 1);
            else if (map.get(t) == 1) {
                list.add(t);
                map.put(t, 2);
            }
        }
        return list;
    }

}