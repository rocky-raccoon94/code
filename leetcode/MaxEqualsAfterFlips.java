package leetcode;

class MaxEqualsAfterFlips {
    public int maxEqualsAfterFlips(int[][] matrix) {
        int len = matrix.length;
        boolean[] visited = new boolean[len];
        int res = 0;
        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                int tem = 0;
                visited[i] = true;
                for (int j = i + 1; j < len; j++) {
                    if (!visited[j]) {
                        if (bite(matrix[i], matrix[j])) {
                            tem++;
                            visited[j] = true;
                        }
                    }
                }
                res = Math.max(res, tem);
            }
        }
        return res;
    }
    public boolean bite(int[] a, int[] b) {
        if (a[0] != b[0]) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] + b[i] != 1)
                    return false;
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i])
                    return false;
            }
        }
        return true;
    }


}