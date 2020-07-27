package leetcode;

import dependences.ListNode;

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode tail = head.next;
        ListNode p = head;
        ListNode q = tail;
        while (q != null && q.next != null) {
            p.next = q.next;
            p = p.next;
            q.next = p.next;
            q = q.next;

        }
        p.next = tail;
        return head;
    }

}