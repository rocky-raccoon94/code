package java;

public class NumOfSubarrays {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        threshold *= k;
        int cnt = 0;
        for (int i = 0; i < k; i++)
            threshold -= arr[i];
        for (int i = 0; i <= arr.length - k; i++) {
            if (threshold <= 0)
                cnt++;
            threshold -= arr[i] + arr[i + k];
        }
        return threshold <= 0 ? cnt + 1 : cnt;

    }

}