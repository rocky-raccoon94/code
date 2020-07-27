function simpleArraySum(ar) { 
    return ar.reduce((a, b) => a + b, 0);
}

console.log(simpleArraySum([2,4,5]))