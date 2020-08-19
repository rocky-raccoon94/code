

function ListNode(val, next) {
    this.val = (val === undefined ? 0 : val)
    this.next = (next === undefined ? null : next)
}


var removeNthFromEnd = function (head, n) {
    let cnt = 0;
    let p = head;
    while (p != null) {
        cnt++;
        p = p.next;
    }
    let pos = cnt - n + 1;
    if (pos === 1) head = head.next;
    else {
        p = head;
        while (--pos > 1) {
            p = p.next;
        }
        p.next = p.next.next;
    }
    return head;


};