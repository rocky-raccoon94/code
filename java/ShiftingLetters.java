package java;

public class ShiftingLetters {
    public static String shiftingLetters(String S, int[] shifts) {
        StringBuilder builder = new StringBuilder();
        int shift = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            shift += shifts[i] % 26;
            int t = S.charAt(i) + shift % 26;
            if (t > 122)
                t = t % 122 + 96;
            builder.append((char) t);
        }
        return builder.reverse().toString();
    }

}