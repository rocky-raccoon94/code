





const allCellsDistOrder = (R, C, r0, c0) => {
    const res = [];
    for (let r = 0; r < R; r++) {
        for (let c = 0; c < C; c++) {
            res.push([r, c]);
        }
    }
    res.sort((x, y) => {
        return Math.abs(x[0] - r0) + Math.abs(x[1] - c0) - Math.abs(y[0] - r0) - Math.abs(y[1] - c0);
    })
    return res;
}

