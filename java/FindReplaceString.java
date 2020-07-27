package java;

public class FindReplaceString {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        StringBuilder builder = new StringBuilder();
        sort(indexes, sources, targets);
        int pre = 0;
        for (int i = 0; i < indexes.length; i++) {
            builder.append(S.substring(pre, indexes[i]));
            pre = indexes[i];
            String t = S.substring(pre);
            if (t.startsWith(sources[i])) {
                builder.append(targets[i]);
                pre += sources[i].length();
            }
            if (i == indexes.length - 1)
                builder.append(S.substring(pre));
        }
        return builder.toString();
    }

    public void sort(int[] a, String[] b, String[] c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    swap(a, i, j);
                    swap(b, i, j);
                    swap(c, i, j);
                }
            }
        }

    }

    public <T> void swap(T[] x, int i, int j) {
        T tem = x[i];
        x[i] = x[j];
        x[j] = tem;
    }

    public void swap(int[] x, int i, int j) {
        int tem = x[i];
        x[i] = x[j];
        x[j] = tem;
    }

    public static void main(String... args) {
        System.out.print("haha".substring(0, 0).length());
    }
}

// class Solution {
// public String findReplaceString(String S, int[] indexes, String[] sources,
// String[] targets) {
// int N = S.length();
// int[] match = new int[N];
// Arrays.fill(match, -1);

// for (int i = 0; i < indexes.length; ++i) {
// int ix = indexes[i];
// if (S.substring(ix, ix + sources[i].length()).equals(sources[i]))
// match[ix] = i;
// }

// StringBuilder ans = new StringBuilder();
// int ix = 0;
// while (ix < N) {
// if (match[ix] >= 0) {
// ans.append(targets[match[ix]]);
// ix += sources[match[ix]].length();
// } else {
// ans.append(S.charAt(ix++));
// }
// }
// return ans.toString();
// }
// }