


function minTime(n, edges, hasApple) {
    let map = new Map();
    for (let edge of edges) {
        if (!map.has(edge[0])) map.set(edge[0], [edge[1]]);
        else map.get(edge[0]).push(edge[1]);
    }
    pre = 0;
    const traverse = (root, pre, cur) => {
        let apples = 0;
        if (map.has(root)) {
            for (let t of map.get(root)) {
                if (hasApple[t]) {
                    pre = cur;
                    apples += 2;
                }
                apples += traverse(t, pre, cur + 1);
            }
        }

        return apples;
    }
    const res = traverse(0, 0);
    return res;
}

let edges = [[0, 1], [0, 2], [1, 3], [3, 4], [4, 5]];
const hasApple = [false, true, false, false, true, true];
const n = 6;
console.log(minTime(n, edges, hasApple));




