function compareTriplets(a, b) {
    let p1 = 0, p2 = 0;
    for (let i = 0; i < 3; i++) { 
        if (a[i] < b[i]) p2++;
        else if(a[i]>b[i]) p1++
    }
    return [p1, p2];
 }