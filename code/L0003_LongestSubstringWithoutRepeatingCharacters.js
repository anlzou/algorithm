/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    const mapper = {}; // 记录已经出现过的charactor
    let res = 0;
    let slidingWindow = [];

    for (let c of s) {
        if (mapper[c]) {
            // 已经出现过了
            // 则删除
            const delIndex = slidingWindow.findIndex(_c => _c === c);

            for (let i = 0; i < delIndex; i++) {
                mapper[slidingWindow[i]] = false;
            }

            slidingWindow = slidingWindow.slice(delIndex + 1).concat(c);
        } else {
            // 新字符
            if (slidingWindow.push(c) > res) {
                res = slidingWindow.length;
            }
        }
        mapper[c] = true;
    }
    return res;
};