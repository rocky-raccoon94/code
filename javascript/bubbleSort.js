

function bubbleSort(a) {
    let swaps = 0;
    while (true) {

        let flag = true;
        for (let i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                let tmp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = tmp;
                swaps++;
                flag = false;
            }
        }
        if (flag)
            break;
    }
    console.log(`Array is sorted in ${swaps} steps`)
    console.log(`First element: ${a[0]}`);
    console.log(`Last element: ${a[a.length-1]}`);
}
bubbleSort([1, 3, 2])