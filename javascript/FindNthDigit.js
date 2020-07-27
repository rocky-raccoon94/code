const findNthDigit = function (n) {
    let start = 1;
    let len = 1;
    let count = 9;
    while (n > len * count) {
        n -= len * count;
        start *= 10;
        len++;
        count *= 10;
    }
    start += Math.floor((n - 1) / len);
    let s = String(start);
    return Number(s[(n - 1) % len]);
}