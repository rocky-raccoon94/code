function birthday(s, d, m) {
    let cur = 0, res = 0;
    for (let i = 0; i < m; i++)
        cur += s[i];
    for (let i = 0; i < s.length -m; i++) {
        if (cur === d) res++;
        cur += cur[i + m] - cur[i];
    }
    return res;
 }