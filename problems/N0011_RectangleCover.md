<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-30 14:28:21
 * @FilePath    : \algorithm\problems\N0011_RectangleCover.md
 * @Describe    : 
 -->
## 题目地址

[nowcoder](https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&tqId=11163&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking&from=cyc_github)

## 题目描述

问题：
```
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
```
示例：
```
比如n=3时，2*3的矩形块有3种覆盖方法：
[|][|][|]    [|][—][—]      [—][—][|]
[|][|][|]    [|][—][—]      [—][—][|]
```

## 思路
- 当 n 为 1 时，只有一种覆盖方法：
```
[—][—]
```
- 当 n 为 2 时，有两种覆盖方法：
```
[—][—]      [|][|]
[—][—]      [|][|]
```
- 要覆盖 2\*n 的大矩形，可以先覆盖 2\*1 的矩形，再覆盖 2\*(n-1) 的矩形；或者先覆盖 2\*2 的矩形，再覆盖 2\*(n-2) 的矩形。而覆盖 2\*(n-1) 和 2\*(n-2) 的矩形可以看成子问题。该问题的递推模型如下：
```
        |              1    n = 1
f(n) =  |              2    n = 2
        |f(n-1) + f(n-2)    n > 1
```
## 关键点
- 递推求解

## 代码
- [N0011_RectangleCover.java](../code/N0011_RectangleCover.java)

## 相似问题
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。

同解。

## 复杂度分析

- 时间复杂度：O(N-1)
- 空间复杂度：O(1)