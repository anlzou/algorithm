/**
 * @Date        : 2020-05-27 10:34:46
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-27 10:58:52
 * @FilePath    : \algorithm\test\Test_N0009.java
 * @Describe    : 
 */
package test;

import code.N0009_Using2stacks2implementQueues;

public class Test_N0009 {
    public static void main(String[] args) throws Exception {
        N0009_Using2stacks2implementQueues test = new N0009_Using2stacks2implementQueues();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        test.push(6);

        for (int j = 0; j < 6; j++) {
            System.out.println(test.pop());
        }
    }
}