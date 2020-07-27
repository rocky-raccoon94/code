function pickingNumbers(a) {
    const tmp = new Array(100);
    tmp.fill(0);
    a.forEach(n => tmp[n]++);
    let res = 0;

    for (let i = 1; i < 99; i++) {
        res = Math.min(res, tmp[i] + tmp[i + 1]);
    }
    returnres;
}

