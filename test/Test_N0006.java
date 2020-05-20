/**
 * @Date        : 2020-05-20 14:47:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-20 15:12:24
 * @FilePath    : \algorithm\test\Test_N0006.java
 * @Describe    : 
 */
package test;

import java.util.ArrayList;

import code.N0006_ReturnListFromTailToHead;
import code.structural.*;

public class Test_N0006 {
    public static void main(String[] args) {
        N0006_ReturnListFromTailToHead test = new N0006_ReturnListFromTailToHead();
        ListNode list = new ListNode(1); // 创建链表对象 list （对应有参构造方法）
        list.add(2); // 插入结点
        list.add(3);

        ArrayList<Integer> ret = test.returnListFromTailToHead3(list);
        System.out.println(ret);
    }
}