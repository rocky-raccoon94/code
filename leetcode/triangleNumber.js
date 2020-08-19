/**
 * @param {number[]} nums
 * @return {number}
 */
var triangleNumber = function (nums) {
    nums.sort((a, b) => a - b);
    const n = nums.length;
    let ans = 0;
    for (let i = 0; i < n; i++) {
        let a = nums[i];
        for (let j = i + 1; j < n; j++) {
            const b = nums[j];
            let k = j;
            while (k + 1 < n && a + b > nums[k + 1]) k++;
            ans += k - j;
        }
    }
    return ans;
};

console.log(triangleNumber([24, 3, 82, 22, 35, 84, 19]));