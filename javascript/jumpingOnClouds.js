function jumpingOnClouds(c) {
    let pre = 0, dp = 1;
    let cur = c[1] === 0 ? 1 : Number.MAX_VALUE;
    for (let i = 2; i < c.length; i++) {
        if (c[i] === 0)
            dp = Math.min(pre, cur) + 1;
        else dp = Number.MAX_VALUE;
        pre = cur;
        cur = dp;
    }
    return dp;
}