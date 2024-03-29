<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-17 21:56:24
 * @FilePath    : \algorithm\problems\M0011_print1ToMaxOfNDigits.md
 * @Describe    : 
 -->
## 题目地址
[CyC2018/CS-Notes](https://github.com/CyC2018/CS-Notes/blob/master/notes/17.%20%E6%89%93%E5%8D%B0%E4%BB%8E%201%20%E5%88%B0%E6%9C%80%E5%A4%A7%E7%9A%84%20n%20%E4%BD%8D%E6%95%B0.md)

## 题目描述

问题：
```
输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
```
示例：
```
比如输入 3，则打印出 1、2、3 一直到最大的 3 位数即 999。
```

## 思路
由于 n 可能会非常大，因此不能直接用 int 表示数字，而是用 char 数组进行存储。

使用回溯法得到所有的数。

## 关键点
- 回溯法 [algorithm-design-and-analysis/chapters/chapter05-backtracking/test5-1.md](https://github.com/anlzou/algorithm-design-and-analysis/blob/master/chapters/chapter05-backtracking/test5-1.md)

## 代码
- [M0011_Print1ToMaxOfNDigits.java](../code/M0011_Print1ToMaxOfNDigits.java)

## 复杂度分析

- 时间复杂度：O( )
- 空间复杂度：O( )