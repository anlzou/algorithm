<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-28 09:45:44
 * @FilePath    : \algorithm\problems\N0010_Fibonacci.md
 * @Describe    : 
 -->
## 题目地址

[nowcoder](https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking&from=cyc_github)

## 题目描述

问题：
```
大家都知道斐波那契数列，现在要求输入一个整数n，
请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
n<=39
```

## 思路
#1

使用递归方法，效率低

#2

使用动态规划法，效率高

## 关键点
递归是将一个问题划分成多个子问题求解，动态规划也是如此，但是动态规划会把子问题的解缓存起来，从而避免重复求解子问题。

## 代码
#1
- [N0010_Fibonacci.java](../code/N0010_Fibonacci.java)

#2
- [动态规划法](https://github.com/anlzou/algorithm-design-and-analysis/blob/master/chapters/chapter08-dynamic-programming/test8-1.md)
## 复杂度分析

- 时间复杂度：O( )
- 空间复杂度：O( )