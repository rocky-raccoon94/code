var integerBreak = function (n) {
    if (n === 2) return 1;
    var div = (x, cur) => {
        if (x === 4 || x === 2) return x * cur;
        return div(x - 3, cur * 3);
    }
    return div(n, 1);
}
