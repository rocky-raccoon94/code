var isRobotBounded = function (instructions) {
    let [x, y] = [0, 0];
    let dir = 0;
    for (let c of instructions) {
        if (c === 'L') dir = (dir + 3) % 4;
        else if (c === 'R') dir = (dir + 1) % 4;
        else switch (dir) {
            case 0: y++;
                break;
            case 1: x++;
                break;
            case 2: y--;
                break;
            case 3: x--;
                break;
        }

    }
    return (x === 0 && y === 0) || dir != 0;

}

