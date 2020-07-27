function countingValleys(n, s) {
    let level = 0, res = 0;
    for (let step of s) {
        
        if (step === 'D' ) {
            if (level-- === 0) res++;
        } else level++;
    }
    return res;
}

