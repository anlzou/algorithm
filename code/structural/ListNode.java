/**
 * @Date        : 2020-05-20 14:55:16
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-20 14:57:52
 * @FilePath    : \algorithm\code\structural\ListNode.java
 * @Describe    : 
 */
package code.structural;

public class ListNode {
    public int val; // 数值 data
    public ListNode next; // 结点 node

    public ListNode(int x) { // 可以定义一个有参构造方法，也可以定义一个无参构造方法
        val = x;
    }

    // 添加新的结点
    public void add(int newval) {
        ListNode newNode = new ListNode(newval);
        if (this.next == null)
            this.next = newNode;
        else
            this.next.add(newval);
    }

    // 打印链表
    public void print() {
        System.out.print(this.val);
        if (this.next != null) {
            System.out.print("-->");
            this.next.print();
        }
    }

}