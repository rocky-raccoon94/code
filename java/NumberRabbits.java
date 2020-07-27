package java;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NumberRabbits {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int ans : answers) {
            if (ans == 0) {
                res++;
            } else if (!map.containsKey(ans)) {
                res += ans;
                map.put(ans, 1);
            } else if (map.get(ans) == ans + 1) {
                res += ans + 1;
                map.put(ans, 1);
            } else {
                map.put(ans, map.get(ans) + 1);
            }
        }
        return res + map.size();

    }

    public static void main(String... args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int[] a = new int[random.nextInt(20)];
            for (int j = 0; j < a.length; j++) {
                a[j] = random.nextInt(20);
            }
            System.out.println(Arrays.toString(a));
        }
    }
}