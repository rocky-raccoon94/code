var carPooling = function (trips, capacity) {
    let n = new Array(1001);
    n.fill(0, 0, 1001);
    for (let trip of trips) {
        for (let i = trip[1]; i < trip[2]; i++) {
            n[i] += trip[0];
            if (n[i] > capacity)
                return false;
        }
    }
    return true;
}
