package leetcode;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class ConsecutiveNumbersSum {
    public int consecutiveNumverSsum(int N) {
        int res = 0;
        int j = 1;
        for (int i = 1; i < N / 2 && i <= j; i++) {
            while ((j - i + 1) * (j + i) < N * 2)
                j++;
            if ((j - i + 1) * (j + i) < N * 2)
                res++;
        }
        return res;
    }

    public static void main(String... args) {
        Logger logger = System.getLogger("morse");
        logger.log(Level.INFO, new ConsecutiveNumbersSum().consecutiveNumverSsum(12));
    }

}