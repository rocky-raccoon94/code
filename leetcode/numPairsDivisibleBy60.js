var numPairsDivisibleBy60 = function (time) {
    const arr = new Array(60);
    arr.fill(0);
    time.forEach(x => arr[x % 60]++);
    let res = 0;
    for (let i = 1; i < 30; i++) {
        res += Math.min(arr[i], arr[60 - i]);
    }
    res += Math.floor(arr[30] / 2) + Math.floor(arr[0] / 2);
}