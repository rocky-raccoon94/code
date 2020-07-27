function climbingLeaderboard(scores, alice) {
    const binarySearch = (set, l, r, p) => {
        if (l > r) return r + 1;
        let m = Math.floor((l + r) / 2);
        if (p >= set[m])
            if (m === 0 || p < set[m - 1])
                return m + 1;
            else return binarySearch(set, l, m - 1, p)
        return binarySearch(set, m + 1, r, p);
    }
    const res = [];
    const set = [...new Set(scores)];
    set.sort((a, b) => b - a);
    for (let a of alice) {
        res.push(binarySearch(set, 0, set.length, a));
    }
    return res;
}

console.log(climbingLeaderboard([100, 40, 70, 65], [120, 60, 20]));