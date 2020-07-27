package java;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Dequeue {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int f[] = new int[10000001];
        int cur = 0, max = 0;
        for (int i = 0; i < n; i++) {
            int first = in.nextInt();
            if (f[first] == 0)
                cur++;
            deque.addLast(first);
            if (deque.size() > m) {
                int tmp = deque.removeLast();
                if (--f[tmp] == 0)
                    cur--;
            }

            max = Math.max(max, cur);
        }
        System.out.println(max);
        in.close();
    }

}
