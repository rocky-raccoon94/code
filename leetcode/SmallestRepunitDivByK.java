package leetcode;

public class SmallestRepunitDivByK {
    public int smallestRepunitDivByK(int K) {
        if (K % 2 == 0)
            return -1;
        int n = 0;
        for (int i = 1; i <= 10; i++) {
            n = (n * 10) + 1;
            if (n % K == 0)
                return i;
        }
        return -1;

    }

    public static void main(String... args) {
        System.out.print(Integer.MAX_VALUE);
    }

}