package leetcode;

import dependences.ListNode;

public class SplitListToParts {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode t = root;
        int cnt = 0;
        while (t != null) {
            t = t.next;
            cnt++;
        }
        int num = cnt / k;
        int remain = cnt % k;
        ListNode[] ans = new ListNode[k];
        for (int i = 0; i < k; i++) {
            ans[i] = root;
            ListNode head = root;
            int j = 0;
            while (++j < num && head != null) {
                head = head.next;
            }
            if (remain-- > 0 && num > 0 && head != null) head = head.next;
            if (head != null) {
                root = head.next;
                head.next = null;
            }
        }
        return ans;
    }
}

