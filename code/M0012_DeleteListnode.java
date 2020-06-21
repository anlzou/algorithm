/**
 * @Date        : 2020-06-21 21:24:06
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-21 21:26:31
 * @FilePath    : \algorithm\code\M0012_DeleteListnode.java
 * @Describe    : 
 */
package code;

import code.structural.ListNode;

public class M0012_DeleteListnode {
    public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
        if (head == null || tobeDelete == null)
            return null;
        if (tobeDelete.next != null) {
            // 要删除的节点不是尾节点
            ListNode next = tobeDelete.next;
            tobeDelete.val = next.val;
            tobeDelete.next = next.next;
        } else {
            if (head == tobeDelete)
                // 只有一个节点
                head = null;
            else {
                ListNode cur = head;
                while (cur.next != tobeDelete)
                    cur = cur.next;
                cur.next = null;
            }
        }
        return head;
    }

}