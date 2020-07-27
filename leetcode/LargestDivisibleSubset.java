package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        Arrays.sort(nums);
        map.put(0, List.of(nums[0]));
        for (int i = 1; i < nums.length; i++) {
            int s1 = nums[i];
            int len = 0;
            int pos = i;
            for (int j = 0; j < i; j++) {
                if (s1 % nums[j] == 0) {
                    if (map.get(j).size() > len) {
                        len = map.get(j).size();
                        pos = j;
                    }
                }

            }
            if (len > 1) {
                List<Integer> list = new ArrayList<>(map.get(pos));
                list.add(s1);
                map.put(i, list);
            } else
                map.put(i, List.of(s1));
        }

        int pos = 0;
        int max = 0;
        for (int i : map.keySet()) {
            int size = map.get(i).size();
            if (size > max) {
                pos = i;
                max = size;
            }
        }
        return map.get(pos);

    }

}