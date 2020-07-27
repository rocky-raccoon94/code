function permutationEquation(p) {
    const res = [];
    for (let i = 1; i <= p.length; i++) {
        const tmp = p[p[i - 1] - 1];
        res[tmp - 1] = i;
    }
    return res;
}