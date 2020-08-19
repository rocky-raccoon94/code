var removeSubfolders = function (folder) {
    folder.sort((a, b) => a - b);
    prev = ' ';
    const res = [];
    for (let f of folder) {
        if (f.startsWith(prev))
            continue;
        res.push(f);
        prev = f + '/';
    }
    return res;

}

folder = ["/ah/al/am", "/ah/al"];

console.log(folder[0] - folder[1]);

console.log(removeSubfolders(folder));