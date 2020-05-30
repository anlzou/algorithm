/**
 * @Date        : 2020-05-30 13:52:42
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-30 14:01:45
 * @FilePath    : \algorithm\code\N0011_RectangleCover.java
 * @Describe    : 
 */

package code;

public class N0011_RectangleCover {
    public int RectangleCover(int n) {
        if (n <= 2) {
            return n;
        }

        int pre1 = 1, pre2 = 2;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = pre1 + pre2;
            pre1 = pre2;
            pre2 = result;
        }
        return result;
    }
}