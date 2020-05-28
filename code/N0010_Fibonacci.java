/**
 * @Date        : 2020-05-28 09:35:00
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-28 09:43:04
 * @FilePath    : \algorithm\code\N0010_Fibonacci.java
 * @Describe    : 
 */
package code;

public class N0010_Fibonacci {
    public int Fibonacci(int n) {
        if (n <= 1)
            return n;
        int[] fib = new int[n + 1];// 初始为0
        fib[1] = 1;
        for (int i = 2; i <= n; i++)
            fib[i] = fib[i - 1] + fib[i - 2];
        return fib[n];
    }

    public static void main(String[] args) {
        N0010_Fibonacci test = new N0010_Fibonacci();
        int ans;
        ans = test.Fibonacci(3);
        System.out.println(ans);
    }
}