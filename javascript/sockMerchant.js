function sockMerchant(n, ar) {
    const map = new Map();
    for (let a of ar) {
        if (map.has(a))
            map.set(a, map.get(a) + 1);
        else map.set(a, 1);
         
    }
    let res = 0;
    map.forEach(a => res += Math.floor(a/2));
    return res;
}

console.log(sockMerchant(7,[1,2,4,4,,4,4,5,1,1,1]))