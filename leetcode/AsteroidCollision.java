package leetcode;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            int t = asteroids[i];
            if (t < 0) {
                while (!stack.isEmpty() && t < 0) {
                    int tem = stack.pop();
                    if (-t == tem) {
                        t = 0;
                        break;
                    }
                    if (-t < tem)
                        t = tem;
                }
            }
            if (t != 0)
                stack.push(t);
        }
        int n = stack.size();
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
