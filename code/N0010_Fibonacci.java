/**
 * @Date        : 2020-05-28 09:35:00
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-28 19:18:11
 * @FilePath    : \algorithm\code\N0010_Fibonacci.java
 * @Describe    : 
 */
package code;

public class N0010_Fibonacci {
    /**
     * 方法一
     */
    public int Fibonacci(int n) {
        if (n <= 1)
            return n;
        int[] fib = new int[n + 1];// 初始为0
        fib[1] = 1;
        for (int i = 2; i <= n; i++)
            fib[i] = fib[i - 1] + fib[i - 2];
        return fib[n];
    }

    /**
     * 方法二
     */
    public int Fibonacci2(int n) {
        if (n <= 1)
            return n;
        int pre2 = 0, pre1 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = pre2 + pre1;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }

    /**
     * 方法三
     */
    public class Solution {

        private int[] fib = new int[40];

        public Solution() {
            fib[1] = 1;
            for (int i = 2; i < fib.length; i++)
                fib[i] = fib[i - 1] + fib[i - 2];
        }

        public int Fibonacci3(int n) {
            return fib[n];
        }
    }

    public static void main(String[] args) {
        N0010_Fibonacci test = new N0010_Fibonacci();
        int ans;
        ans = test.Fibonacci(3);
        System.out.println(ans);
    }
}