/**
 * @Date        : 2020-06-14 16:30:41
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-15 14:50:07
 * @FilePath    : \algorithm\code\N0017_NumberOf1InBinary.java
 * @Describe    : 
 */
package code;

public class N0017_NumberOf1InBinary {
    /**
     * & 运算
     */
    public int NumberOf1_1(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n &= (n - 1);
        }
        return cnt;
    }

    /**
     * Integer.bitCount(n)
     */
    public int NumberOf1_2(int n) {
        return Integer.bitCount(n);
    }

    /* ===============test================ */
    public static void main(String[] args) {
        N0017_NumberOf1InBinary test = new N0017_NumberOf1InBinary();
        int ans1 = 0, ans2 = 0;
        int n = 180;

        ans1 = test.NumberOf1_1(n);
        ans2 = test.NumberOf1_2(n);

        System.out.println(ans1);
        System.out.println(ans2);
    }
}