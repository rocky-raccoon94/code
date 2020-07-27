function migratoryBirds(arr) {
    arr.sort((a, b) => a - b);
    let bird;
    let nums = 0;
    const map = new Map();
    for (let i = 0; i < arr.length; i++) {
        const t = arr[i];
        if (map.has(t))
            map.set(t, map.get(t) + 1);
        else map.set(t, 1);
    }
    for (let entrie in map.entries()) {
        const b = entrie[0];
        if (entrie[1] > nums || (entrie[1] === nums && b < bird))
            bird = b;
    }
    return bird;
 }