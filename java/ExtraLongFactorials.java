package java;

import java.math.BigInteger;

class ExtraLongFactorials {
    public static BigInteger extraLongFactorials(int n) {
        var f = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    public static void main(String... args) {
        var out = System.out;
        out.print(extraLongFactorials(25));
    }
    
}