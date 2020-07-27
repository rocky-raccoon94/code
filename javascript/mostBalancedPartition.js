function mostBalancedPartition(parent, file_size) {
    let diff = Number.MAX_VALUE;
    const dfs = root => {
        let res = file_size[root];
        for (let i = 0; i < parent.length; i++) {
            if (parent[i] == root) {
                res += dfs(i);
            }
        }
        return res;

    }
    let sum = dfs(0);
    for (let i = 1; i < parent.length; i++) {
        diff = Math.min(diff, sum - dfs(i));
    }
    return diff;

}