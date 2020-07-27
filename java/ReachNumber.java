package java;

public class ReachNumber {
    public static int reachNumber(int target) {
        int cnt = 0;
        int sum = 0;
        while (sum < target) {
            cnt++;
            sum += cnt;
        }
        while ((sum - target) % 2 != 0) {
            cnt++;
            sum += cnt;
        }
        return cnt;

    }

    public static void main(String... args) {
        int res = reachNumber(15);
        System.out.println(res);
    }

}