const sort = f => arr => {
    arr.sort(f);
}

const f = sort((a, b) => b - a);
var a = [1, 4, 3];
f(a);
console.log(a);

