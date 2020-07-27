function repeatedString(s, n) {
    const a = Math.floor(n / s.length);
    const b = n % s.length;
    let num = 0;
    for (let c of s) { 
        if (c === 'a') num++;
    }
    num *= a;
    for (let i = 0; i < b; i++)
        if (s[i] === 'a') num++;
    return num;
}
