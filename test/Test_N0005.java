/**
 * @Date        : 2020-05-20 11:23:38
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-20 11:37:38
 * @FilePath    : \algorithm\test\Test_N0005.java
 * @Describe    : 
 */
package test;

import code.*;

public class Test_N0005 {
    public static void main(String[] args) {
        N0005_ReplaceSpace test = new N0005_ReplaceSpace();

        StringBuffer str = new StringBuffer("A B C D");
        String recvString = test.replaceSpace(str);
        System.out.println(recvString);
    }
}