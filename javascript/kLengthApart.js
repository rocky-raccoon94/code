var kLengthApart = (nums, k) => {
    let cur = -1;
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === 1) {
            if (cur < 0) cur = i;
            else {
                if (i - cur <= k) return false;
                cur = i;
            }
        }
    }
    return true;
}