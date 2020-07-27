package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuggestedProducts {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> list = new ArrayList<>();
        Arrays.sort(products);
        List<String> p = new ArrayList<>(Arrays.asList(products));
        int pos = 0;
        while (pos < searchWord.length()) {
            char c = searchWord.charAt(pos);
            List<String> tem = new ArrayList<>();
            for (String s : p) {
                if (s.charAt(pos) == c)
                    tem.add(s);
            }
            p = tem;
            List<String> m = new ArrayList<>();
            for (int t = 0; t < Math.min(3, p.size()); t++) {
                m.add(p.get(t));
            }
            list.add(m);
            pos++;

        }
        return list;
    }

}