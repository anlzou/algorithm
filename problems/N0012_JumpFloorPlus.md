<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-30 14:53:50
 * @FilePath    : \algorithm\problems\N0012_JumpFloorPlus.md
 * @Describe    : 
 -->
## 题目地址

[nowcoder](https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387?tpId=13&tqId=11162&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking&from=cyc_github)

## 题目描述

问题：
```
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
```

## 思路
#1

动态规划

#2

数学推导

跳上 n-1 级台阶，可以从 n-2 级跳 1 级上去，也可以从 n-3 级跳 2 级上去...，那么
```
f(n-1) = f(n-2) + f(n-3) + ... + f(0)
```
同样，跳上 n 级台阶，可以从 n-1 级跳 1 级上去，也可以从 n-2 级跳 2 级上去... ，那么
```
f(n) = f(n-1) + f(n-2) + ... + f(0)
```
综上可得
```
f(n) - f(n-1) = f(n-1)  即  f(n) = 2*f(n-1)
```
所以 f(n) 是一个等比数列

## 关键点


## 代码
#1、2
- [N0012_JumpFloorPlus.java](../code/N0012_JumpFloorPlus.java)

## 复杂度分析

- 时间复杂度：O( )
- 空间复杂度：O( )