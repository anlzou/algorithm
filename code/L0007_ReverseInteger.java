/**
 * @Date : 2020-05-17 09:39:07
 * @LastEditors : anlzou
 * @Github : https://github.com/anlzou
 * @LastEditTime: 2020-05-17 10:10:19
 * @FilePath    : \algorithm\code\L0007_ReverseInteger.java
 * @Describe :
 */
package code;

public class L0007_ReverseInteger {
    int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10)
                return 0;
            if (rev < Integer.MIN_VALUE / 10)
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    int reverse2(int x) {
        long rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;
        return (int) rev;
    }

};