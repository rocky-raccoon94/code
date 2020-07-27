package java;

public class MaskPII {
    private StringBuilder builder;

    public String maskPII(String S) {
        builder = new StringBuilder();
        if (S.contains("@"))
            return maskEmail(S);
        return maskPhone(S);
    }

    private String maskEmail(String S) {
        int t = S.indexOf("@");
        builder.append(Character.toLowerCase(S.charAt(0)));
        builder.append("*****");
        builder.append(Character.toLowerCase(S.charAt(t - 1)));
        return builder.toString() + S.substring(t).toLowerCase();
    }

    private String maskPhone(String S) {
        int cnt = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            char c = S.charAt(i);
            if (Character.isDigit(c)) {
                cnt++;
                if (cnt <= 4)
                    builder.append(c);
                else
                    builder.append("*");
                if (cnt == 4 || cnt == 7 || (cnt == 10 && helper(i, S)))
                    builder.append("-");
            }
        }
        if (cnt > 10)
            builder.append("+");
        return builder.reverse().toString();
    }

    private boolean helper(int t, String s) {
        for (int i = 0; i < t; i++) {
            if (Character.isDigit(s.charAt(i)))
                return true;

        }
        return false;

    }

}