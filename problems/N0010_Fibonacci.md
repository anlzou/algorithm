<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-28 22:35:25
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
使用递归方法，效率低

使用动态规划法，效率高

## 关键点
#1

递归是将一个问题划分成多个子问题求解，动态规划也是如此，但是动态规划会把子问题的解缓存起来，从而避免重复求解子问题。

#2

考虑到第 i 项只与第 i-1 和第 i-2 项有关，因此只需要存储前两项的值就能求解第 i 项，从而将空间复杂度由 O(N) 降低为 O(1)。

#3

由于待求解的 n 小于 40，因此可以将前 40 项的结果先进行计算，之后就能以 O(1) 时间复杂度得到第 n 项的值。
## 代码
#1、2、3
- [N0010_Fibonacci.java](../code/N0010_Fibonacci.java)
- [Test_N0010.java](./../test/Test_N0010.java)

## 补充
[动态规划法](https://github.com/anlzou/algorithm-design-and-analysis/blob/master/chapters/chapter08-dynamic-programming/test8-1.md)

#3 [java 内部类](https://www.runoob.com/w3cnote/java-inner-class-intro.html)
## 复杂度分析

- 时间复杂度：O( )
- 空间复杂度：O( )