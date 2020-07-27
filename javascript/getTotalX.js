function getTotalX(a, b) {
    const gcd = (x, y) => {
        if (x < y) return gcd(y, x);
        return y === 0 ? x : gcd(y, x % y);
    }
    const lcm = (x, y) => x * y / gcd(x, y);
    const m1 = a.reduce((x, y) => lcm(x, y), a[0]);
    const m2 = b.reduce((x, y) => gcd(x, y), b[0]);
    let t = 1;
    let res = 0;
    for (let i = m1; i <= m2; i *= ++t) { 
        if (m2 / i % 1 === 0) res++;
    }
    return res;
}

getTotalX([2, 4, 6], [12, 18, 36]);