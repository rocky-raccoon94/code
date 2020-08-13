package hackerrank;

class Calculator implements AdvanceArithmetic {
    @Override
    public int divisorSum(int n) {
        // TODO Auto-generated method stub
        int res = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                res += i;
                int t = n / i;
                if (t != i)
                    res += t;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        var c = new Calculator();
        System.out.println(c.divisorSum(4));
    }

}