function processData(input) {
    const fib = a => {
        if (a <= 1) return 1;
        return a * fib(a - 1);
    }

    const sf = num => {
        let a = 0;
        for (let digit of num.toString()) {
            a += fib(parseInt(digit));
        }
        let b = 0;
        for (let digit of a.toString()) {
            b += parseInt(digit);
        }
        return b;
    }

    const sg = num => {
        let res;
        for (let i = 0; ; i++) {
            if (sf(i) === num) {
                res = i;
                break;
            }
        }
        let ans = 0;
        for (let digit of res.toString()) {
            ans += parseInt(digit);
        }
        return ans;
    }




}

