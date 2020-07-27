const maxPower = function (s) {
    var ans = 1;
    var cnt = 1;
    for (let i = 0; i < s.length; i++) {
        let c = s.charAt(i);
        while (++i < s.length && s.charAt(i) === c) cnt++;
        ans = Math.max(ans, cnt);
        cnt = 1;
    }
    return ans;

}


