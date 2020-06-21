<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-21 21:27:48
 * @FilePath    : \algorithm\problems\M0012_delete-ListNode-is-O(1).md
 * @Describe    : 
 -->
## 题目地址

[CS-Notes](https://github.com/CyC2018/CS-Notes/blob/master/notes/18.1%20%E5%9C%A8%20O(1)%20%E6%97%B6%E9%97%B4%E5%86%85%E5%88%A0%E9%99%A4%E9%93%BE%E8%A1%A8%E8%8A%82%E7%82%B9.md)

## 题目描述

问题：
```
在 O(1) 时间内删除链表节点
```

## 思路
① 如果该节点不是尾节点，那么可以直接将下一个节点的值赋给该节点，然后令该节点指向下下个节点，再删除下一个节点，时间复杂度为 O(1)。

② 否则，就需要先遍历链表，找到节点的前一个节点，然后让前一个节点指向 null，时间复杂度为 O(N)。

综上，如果进行 N 次操作，那么大约需要操作节点的次数为 N-1+N=2N-1，其中 N-1 表示 N-1 个不是尾节点的每个节点以 O(1) 的时间复杂度操作节点的总次数，N 表示 1 个尾节点以 O(N) 的时间复杂度操作节点的总次数。(2N-1)/N ~ 2，因此该算法的平均时间复杂度为 O(1)。

## 代码
- [M0012_DeleteListnode.java](../code/M0012_DeleteListnode.java)

## 复杂度分析

- 时间复杂度：O(1)
- 空间复杂度：O(N)