package leetcode;

public class NumRescueBoats {
    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        int[] t = new int[limit + 1];
        for (int i = 0; i < people.length; i++) {
            t[people[i]]++;
        }
        for (int i = limit; i > 0; i--) {
            int j = limit - i;
            while (j >= 0 && t[i] > 0) {
                if (t[j] > 0) {
                    int min = Math.min(t[j], t[i]);
                    if (i == j)
                        min /= 2;
                    boats += min;
                    t[i] -= min;
                    t[j] -= min;
                }
                j--;
            }
            boats += t[i];

        }
        return boats;
    }

}