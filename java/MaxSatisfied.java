package java;

public class MaxSatisfied {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int res = 0;
        int sum = 0;
        int t = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0)
                res += customers[i];
        }
        for (int i = 0; i < X; i++) {
            if (grumpy[i] == 1)
                sum += customers[i];
        }
        for (int i = 0; i < customers.length - X; i++) {
            if (grumpy[i + X] == 1)
                sum += customers[i + X];
            if (grumpy[i] == 1)
                sum -= customers[i];
            t = Math.max(sum, t);
        }

        return res + sum;
    }
}