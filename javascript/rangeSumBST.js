

function TreeNode(val, left, right) {
    this.val = (val === undefined ? 0 : val)
    this.left = (left === undefined ? null : left)
    this.right = (right === undefined ? null : right)
}

/**
 * @param {TreeNode} root
 * @param {number} L
 * @param {number} R
 * @return {number}
 */
var rangeSumBST = function (root, L, R) {
    const queue = [root];
    let res = 0;
    while (queue.length > 0) {
        let node = queue.pop();
        const val = node.val;
        if (val <= R && val >= L) res += val;
        if (node.left !== null) queue.push(node.left);
        if (node.right !== null) queue.push(node.right);
    }
    return res;

};