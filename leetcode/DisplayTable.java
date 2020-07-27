package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class DisplayTable {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Map<String, Integer>> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        List<String> tables = new ArrayList<>();
        res.add(tables);
        for (List<String> list : orders) {
            String table = list.get(1);
            String dish = list.get(2);
            set.add(dish);
            if (!map.containsKey(table)) {
                Map<String, Integer> tem2 = new HashMap<>();
                tem2.put(dish, 1);
                map.put(table, tem2);
            } else {
                Map<String, Integer> tem = map.get(table);
                if (tem.containsKey(dish))
                    tem.put(dish, tem.get(dish) + 1);
                else
                    tem.put(dish, 1);
            }
        }
        for (String s : set)
            tables.add(s);
        int[] nums = new int[map.keySet().size()];
        int i = 0;
        for (String s : map.keySet())
            nums[i++] = Integer.parseInt(s);
        Arrays.sort(nums);
        Collections.sort(tables);
        for (int s : nums) {
            String s1 = String.valueOf(s);
            List<String> table = new ArrayList<>();
            table.add(s1);
            Map<String, Integer> tem = map.get(s1);
            for (String t : tables) {
                if (tem.containsKey(t))
                    table.add(String.valueOf(tem.get(t)));
                else
                    table.add(String.valueOf(0));
            }

            res.add(table);

        }
        tables.add(0, "Table");
        return res;
    }
}