const findOcurrences = (text, first, second) => {
    const t = text.split(" ");
    const res = [];
    for (let i = 2; i < t; i++) {
        if (t[i - 2] == first && t[i - 1] == second) {
            res.push(t[i]);
            i += 2;
        }
    }
    return res;


console.log("haha");