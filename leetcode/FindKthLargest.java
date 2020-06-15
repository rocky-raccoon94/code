package leetcode;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int m = l;
            int t = nums[l];
            for (int i = l + 1; i <= r; i++) {
                if (nums[i] >= t)
                    swap(nums, i, ++m);
            }
            swap(nums, m, l);
            if (m == k - 1)
                return nums[m];
            else if (m > k - 1)
                r = m - 1;
            else
                l = m + 1;
        }
        return nums[l];
    }

    public  void swap(int[] x, int a, int b) {
        int tem = x[a];
        x[a] = x[b];
        x[b] = tem;
    }
    public static void main(String ...args){
        var code = new FindKthLargest();
        System.out.println(code.findKthLargest(new int[]{4,3,2,1,4,4,4},6));
    }
}

// I use quick sort here.