package java;
//you can also sort array. It will be O(nlogn)
public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int t = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (t > nums[j])
                    res[i]++;
                else if (t < nums[j])
                    res[j]++;
            }
        }
        return res;

    }

}