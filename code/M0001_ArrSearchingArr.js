/*
 * @Date        : 2020-05-02 22:38:24
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-02 22:59:04
 * @FilePath    : \algorithm\code\M0001_ArrSearchingArr.js
 * @Describe    : 判断数组a是否全包含数组b
 */
function is_array_contain(a, b) {
    for (var i = 0; i < b.length; i++) {
        t = false;
        for (var j = 0; j < a.length; j++) {
            if (b[i] == a[j]) {
                t = true;
                break;
            }
        }
        if (!t) return false;
    }
    return true;
}