package java;
public class ServingSoups {

    public double servingSoups(int N) {
        return helper(N, N, 1);
        
    }

    public double helper(int A, int B, double prob) {
        if (A > 0) {
            prob *= 0.25;
            return B > 0
                    ? helper(A - 100, B, prob) + +helper(A - 75, B - 25, prob) + helper(A - 50, B - 50, prob)
                            + helper(A - 25, B - 75, prob)
                    : 0;
        } else
            return B > 0 ? prob : prob * 0.5;

    }

    public static void main(String... args) {
        var t = new ServingSoups();
        System.out.print(t.servingSoups(500000));

    }
}