<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-17 20:19:26
 * @FilePath    : \algorithm\problems\N0018_integer-power-of-value.md
 * @Describe    : 
 -->
## 题目地址

[nowcoder](https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00?tpId=13&tqId=11165&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking&from=cyc_github)

## 题目描述

问题：
```
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

保证base和exponent不同时为0，可以为负数。
```

## 思路
### 递归快速幂

下面的讨论中 x 代表 base，n 代表 exponent。
```
x^^n =  |  (x*x)^^(n/2)   n%2 = 0
        |x*(x*x)^^(n/2)   n%2 = 1
```
因为 (x*x)^^(n/2) 可以通过递归求解，并且每次递归 n 都减小一半，因此整个算法的时间复杂度为 O(logN)。

## 关键点
- [快速幂](https://zhuanlan.zhihu.com/p/95902286)

## 代码
- [N0018_IntegerPowerOfValue.java](../code/N0018_IntegerPowerOfValue.java)

## 复杂度分析

- 时间复杂度：O(logN)
- 空间复杂度：O(N)