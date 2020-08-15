
function ListNode(val, next) {
    this.val = val === undefined ? null : val;
    this.next = next === undefined ? null : next;
}


var nextLargerNodes = function (head) {
    const nextLarger = (head) => {
        let res = 0;
        const val = head.val;
        while (head.next != null) {
            head = head.next;
            if (head.val > val)
                return head.val;
        }
        return res;
    }
    const ans = [];
    let p = head;
    while (p !== null) {
        ans.push(nextLarger(p));
        p = p.next;
    }
    return ans;
}