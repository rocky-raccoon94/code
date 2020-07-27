function findSubstring(s, k) {
    const vowel = ['a', 'e', 'i', 'o', 'u'];
    const add = c => vowel.includes(c) ? 1 : 0;
    let cnt = 0, start = -1, cur = 0;
    for (let i = 0; i < k; i++) {
        cnt += add(s.charAt(i));
    }
    if (cnt > 0) {
        start = 0;
        cur = cnt;
    }
    for (let i = 0; i < s.length - k; i++) {
        cnt += add(s.charAt(i + k)) - add(s.charAt(i));
        if (cnt > cur) { 
            start = i+1;
            cur = cnt;
        }
    }
    return s.substring(start, start + k);

}
console.log(findSubstring('ahihesiii', 3));