package leetcode;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            while (i < j && A[i] % 2 == 0)
                i++;
            while (j > i && A[j] % 2 != 0)
                j--;
            swap(A, i, j);
            i++;
            j--;

        }
        return A;

    }

    public void swap(int[] x, int i, int j) {
        int tem = x[i];
        x[i] = x[j];
        x[j] = tem;
    }

}