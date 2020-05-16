<!--
 * @Date        : 2020-05-03 21:18:46
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-16 11:56:33
 * @FilePath    : \algorithm\problems\L0002_addTwoNumbers.md
 * @Describe    : 
 -->
## 题目地址

[https://leetcode-cn.com/problems/add-two-numbers/](https://leetcode-cn.com/problems/add-two-numbers/)

## 题目描述

问题：
```
#English
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.


#中文.机器翻译
你有两个非空链表代表两个非负整数。这些数字以相反的顺序存储，每个节点包含一个数字。将这两个数字相加并以链表的形式返回。

您可以假设这两个数字不包含任何前导零，除了数字0本身。
```
示例：
```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```

## 思路
#1
设立一个表示进位的变量carried，建立一个新链表， 把输入的两个链表从头往后同时处理，每两个相加，将结果加上carried后的值作为一个新节点到新链表后面。

#2
[LeetCodeAnimation](https://github.com/MisterBooo/LeetCodeAnimation/blob/master/notes/LeetCode%E7%AC%AC2%E5%8F%B7%E9%97%AE%E9%A2%98%EF%BC%9A%E4%B8%A4%E6%95%B0%E7%9B%B8%E5%8A%A0.md)

## 关键点
- 链表这种数据结构的特点和使用
- 用一个carried变量来实现进位的功能，每次相加之后计算carried，并用于下一位的计算

## 代码
#1 [L0002_addTwoNumbers.cpp](../code/L0002_addTwoNumbers.cpp)

#3 [L0002_addTwoNumbers.js](../code/L0002_addTwoNumbers.js)

## 复杂度分析

- 时间复杂度：O(N)
- 空间复杂度：O(N)

# 拓展
通过单链表的定义可以得知，单链表也是递归结构，因此，也可以使用递归的方式来进行reverse操作。
> 由于单链表是线性的，使用递归方式将导致栈的使用也是线性的，当链表长度达到一定程度时，递归会导致爆栈，因此，现实中并不推荐使用递归方式来操作链表。
## 描述
1. 将两个链表的第一个节点值相加，结果转为0-10之间的个位数，并设置进位信息
2. 将两个链表第一个节点以后的链表做带进位的递归相加
3. 将第一步得到的头节点的next指向第二步返回的链表
## 实现
[L0002_addTwoNumbers_recursion.cpp](../code/L0002_addTwoNumbers_recursion.cpp)