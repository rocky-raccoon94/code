package java;

class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        int[] count = new int[10001];
        for (int num : nums)
            count[num]++;
        int using = 0, avoid = 0, prev = -1;
        for (int k = 1; k < 10001; k++) {
            int m = Math.max(avoid, using);
            if (count[k] > 0) {
                if (k - 1 != prev) {
                    using = m + count[k] * k;
                } else {
                    using = count[k] * k + avoid;
                }
                avoid = m;
                prev = k;
            }
        }
        return Math.max(using, avoid);
    }

}