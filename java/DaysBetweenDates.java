package java;

import java.util.Set;

public class DaysBetweenDates {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(days(date1) - days(date2));
    }

    public int days(String date) {
        Set<Integer> set1 = Set.of(1, 3, 5, 7, 8, 10, 12);
        String[] s = date.split("-");
        int year = Integer.parseInt(s[0]);
        boolean leap = isLeap(year);
        int month = Integer.parseInt(s[1]);
        int res = Integer.parseInt(s[2]);
        for (int i = 1971; i < year; i++) {
            if (isLeap(i))
                res += 366;
            else
                res += 365;
        }
        for (int i = 1; i < month; i++) {
            if (i == 2) {
                if (leap)
                    res += 29;
                else
                    res += 28;
            } else if (set1.contains(i))
                res += 31;
            else
                res += 30;
        }
        return res;
    }

    public boolean isLeap(int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }
}