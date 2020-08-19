function TreeNode(val, left, right) {
    this.val = val;
    this.left = left === undefined ? null : left;
    this.right = right === undefined ? null : right;

}


var lcaDeepestLeaves = function (root) {
    if (root === null) return null;
    const getHeight = (node) => {
        if (node === null) return 0;
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
    let l = getHeight(root.left);
    let r = getHeight(root.right);

    if (l > r)
        return lcaDeepestLeaves(root.left);
    else if (l < r)
        return lcaDeepestLeaves(root.right);
    return root;

}

