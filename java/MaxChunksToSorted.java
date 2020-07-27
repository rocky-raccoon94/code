package java;
public class MaxChunksToSorted {
    public int maxChunksToSorted(int[] arr) {
        int res = 0;
        int maxsofar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxsofar = Math.max(arr[i], maxsofar);
            if (i == maxsofar)
                res++;
        }
        return res;
    }

}