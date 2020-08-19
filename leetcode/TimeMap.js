var TimeMap = function () {
    this.map = new Map();
}

TimeMap.prototype.set = function (key, val, timestamp) {
    if (!this.map.has(key)) {
        const a = [];
        a[timestamp] = val;
        this.map.set(key, a);
    }
    else map.get(key)[timestamp] = val;
};

TimeMap.prototype.get = function (key, timestamp) {
    if (this.map.has(key)) {
        const arr = this.map.get(key);
        while (timestamp >= 0) {
            if (arr[timestamp] !== undefined)
                return arr[timestamp];
            timestamp--;
        }
    }
    return '';
};

let obj = new TimeMap();
obj.set('f', 'b', 2);
console.log(obj.get('f', 6));