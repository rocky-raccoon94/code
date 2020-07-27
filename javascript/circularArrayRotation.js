function circularArrayRotation(a, k, queries) {
    const res = [];
    let n = k % a.length;
    queries.forEach(t => { 
        if (t >= n) res.push(a[t - k]);
        else res.push(a[a.length - n + t]);
    })
    return res;
}
console.log(circularArrayRotation([1, 2, 3, 4], 3, [0, 1, 2, 3]));