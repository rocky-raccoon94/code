package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CanBeEqual {
    public static boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            map1.put(target[i], map1.getOrDefault(target[i], 0) + 1);
            map2.put(arr[i], map2.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map1);
        System.out.println(map2);

        for (int t : target) {
            if (!map2.containsKey(t) || map1.get(t) != map2.get(t))
                return false;

        }
        return true;
    }

    public static void main(String... args) {
        canBeEqual(new int[] { 1, 2, 3, 4 }, new int[] { 3, 2, 1, 4 });

    }

}