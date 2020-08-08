/*
 * @Date        : 2020-08-08 16:22:53
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-08-08 16:30:01
 * @FilePath    : \algorithm\code\M0014_first_largest_palindrome_string\M0014_The_first_largest_palindrome_string_in_a_string.js
 * @Describe    : 
 */

new Vue({
    el: '#app-test',
    data: {
        s: "dsad",
    },
    methods: {
        changes: function () {
            var s = this.s;
            var max = "";
            for (var i = 0; i < s.length; i++) {
                var mas = s.charAt(i);//定义回文中心
                masH = i - 1;//回文左边界
                masF = i + 1;//回文右边界
                while (masH >= -1 & masF < s.length) {
                    //奇数回文中心变化
                    if (s.charAt(masH) == s.charAt(masF)) {
                        mas = s.charAt(masH) + mas + s.charAt(masF);
                        masH--;
                        masF++;
                    } else {
                        //偶数回文中心变化
                        if (s.charAt(masF) == s.charAt(masF - 1)) {
                            mas += s.charAt(masF);
                            masF++;
                        } else {
                            break;
                        }
                    }
                }
                //只采用第一个最长回文
                if (mas.length > max.length) {
                    max = mas;
                }
            }
            return max;
        }
    }

})