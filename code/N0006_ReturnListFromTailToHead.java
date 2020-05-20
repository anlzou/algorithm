/**
 * @Date : 2020-05-20 14:42:30
 * @LastEditors : anlzou
 * @Github : https://github.com/anlzou
 * @LastEditTime: 2020-05-20 15:20:43
 * @FilePath    : \algorithm\code\N0006_ReturnListFromTailToHead.java
 * @Describe :
 */
package code;

import java.util.ArrayList;
import java.util.Stack;

import code.structural.*;

public class N0006_ReturnListFromTailToHead {

    /**
     * 递归法
     * 
     * @param listNode
     * @return
     */
    public ArrayList<Integer> returnListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(returnListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

    /**
     * 头插法
     * 
     * @param listNode
     * @return
     */
    public ArrayList<Integer> returnListFromTailToHead2(ListNode listNode) {
        // 头插法构建逆序链表
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
        // 构建 ArrayList
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }

    /**
     * 栈法
     * 
     * @param listNode
     * @return
     */
    public ArrayList<Integer> returnListFromTailToHead3(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (!stack.isEmpty())
            ret.add(stack.pop());
        return ret;
    }
}