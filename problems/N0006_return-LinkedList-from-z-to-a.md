<!--
 * @Date        : 2020-05-20 14:27:48
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-20 15:22:46
 * @FilePath    : \algorithm\problems\N0006_return-LinkedList-from-z-to-a.md
 * @Describe    : 
--> 

## 题目地址

[nowcoder](https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 题目描述

问题：
```
输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
```
示例：
```
Input:1->2->3

Output:3,2,1
```

## [思路](https://github.com/CyC2018/CS-Notes/blob/master/notes/6.%20%E4%BB%8E%E5%B0%BE%E5%88%B0%E5%A4%B4%E6%89%93%E5%8D%B0%E9%93%BE%E8%A1%A8.md)
#1 使用递归

要逆序打印链表 1->2->3（3,2,1)，可以先逆序打印链表 2->3(3,2)，最后再打印第一个节点 1。而链表 2->3 可以看成一个新的链表，要逆序打印该链表可以继续使用求解函数，也就是在求解函数中调用自己，这就是递归函数。

#2 使用头插法

头插法顾名思义是将节点插入到头部：在遍历原始链表时，将当前节点插入新链表的头部，使其成为第一个节点。

链表的操作需要维护后继关系，例如在某个节点 node1 之后插入一个节点 node2，我们可以通过修改后继关系来实现：
```java
node3 = node1.next;
node2.next = node3;
node1.next = node2;
```
为了能将一个节点插入头部，我们引入了一个叫头结点的辅助节点，该节点不存储值，只是为了方便进行插入操作。不要将头结点与第一个节点混起来，第一个节点是链表中第一个真正存储值的节点。

#3 使用栈

栈具有后进先出的特点，在遍历链表时将值按顺序放入栈中，最后出栈的顺序即为逆序。


## 关键点
- ArrayList 的原理，以及其基本方法 <code>add()、addAll()</code> 的使用
- Stack 的原理，以及其基本方法 <code>add()、pop()、isEmpty()</code> 的使用

## 代码
>[ListNode.java](/code/structural/ListNode.java) 
- [N0006_ReturnListFromTailToHead.java](/code/N0006_ReturnListFromTailToHead.java)
- [Test_N0006.java](/test/Test_N0006.java)


## 补充
- [List集合之ArrayList](https://blog.csdn.net/weixin_40304387/article/details/80790177)
- [Java Stack中add与push，peek与pop](https://blog.csdn.net/weixin_41126303/article/details/83013444?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase)

## 复杂度分析

- 时间复杂度：O( )
- 空间复杂度：O( )