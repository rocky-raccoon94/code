var gcdOfStrings = function (str1, str2) {
    const gcd = (x, y) => {
        return x === 0 ? y : gcd(y % x, x);
    }
    return (str1 + str2 === str2 + str1) ? str1.substring(0, gcd(str1.length, str2.length)) : '';

}
console.log(gcdOfStrings('ABCABC', 'ABCABCABC'));