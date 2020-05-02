/*
 * @Date        : 2020-05-02 22:38:36
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-02 22:40:52
 * @FilePath    : \algorithm\code\M0002_ArrGetM2Comb.js
 * @Describe    :
 */
function ArrGetM2Comb(array, M) {
    var N = array.length;
    var top = 0, queue = [], arr = [], _arr = [];
    function comb(s, n, m) {
        var i;
        if (s > n)
            return;
        if (top == m) {
            for (i = 0; i < m; i++) {
                _arr.push(queue[i]);
            }
            arr.push(_arr)
            _arr = []
            return;
        }
        queue[top++] = array[s];
        comb(s + 1, n, m);
        top--;
        comb(s + 1, n, m);
    }
    comb(0, N, M);
    return arr
}