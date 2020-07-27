package java;

public class MagicalString {
    public static int magicalString(int n) {
        if (n <= 0)
            return 0;
        int ans = 1;
        int[] x = new int[n];
        x[0] = 1;
        int ptr = 1;
        for (int i = 0; i < n; i++) {
            if (x[i] == 1) {
                ans++;
                if (ptr < n)
                    x[ptr] = 3 - x[ptr - 1];
                ptr++;
            } else {
                if (ptr < n)
                    x[ptr] = x[ptr - 1];
                if (ptr < n - 1)
                    x[ptr + 1] = 3 - x[ptr - 1];
                ptr += 2;
            }

        }
        return ans;

    }

    public static void main(String... args) {
        magicalString(20);

    }


}
