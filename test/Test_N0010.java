/**
 * @Date        : 2020-05-28 22:31:25
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-28 22:33:25
 * @FilePath    : \algorithm\test\Test_N0010.java
 * @Describe    : 
 */
package test;

import code.N0010_Fibonacci;

public class Test_N0010 {

    public static void main(String[] args) {
        N0010_Fibonacci test = new N0010_Fibonacci();
        int ans;

        // 方法一
        ans = test.Fibonacci(10);
        System.out.println(ans);

        // 方法二
        ans = test.Fibonacci2(10);
        System.out.println(ans);

        // 方法三
        N0010_Fibonacci test2 = new N0010_Fibonacci();
        N0010_Fibonacci.Solution test3 = test2.new Solution();
        ans = test3.Fibonacci3(10);
        System.out.println(ans);
    }

}