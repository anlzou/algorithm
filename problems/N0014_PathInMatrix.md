<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-10 20:12:58
 * @FilePath    : \algorithm\problems\N0014_PathInMatrix.md
 * @Describe    : 
 -->
## 题目地址

[nowcoder](https://www.nowcoder.com/practice/c61c6999eecb4b8f88a98f66b273a3cc?tpId=13&tqId=11218&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking&from=cyc_github)

## 题目描述

问题：
```
设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
```
示例：
| a     | b     | c     | e     |
| ----- | ----- | ----- | ----- |
| **s** | **f** | **c** | **s** |
| **a** | **d** | **e** | **e** |
```
矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
```

## 思路
使用回溯法（backtracking）进行求解，它是一种暴力搜索方法，通过搜索所有可能的结果来求解问题。回溯法在一次搜索结束时需要进行回溯（回退），将这一次搜索过程中设置的状态进行清除，从而开始一次新的搜索过程。

## 关键点
- [algorithm-design-and-analysis / 回溯法概述](https://github.com/anlzou/algorithm-design-and-analysis/blob/master/chapters/chapter05-backtracking/test5-1.md)

## 代码


## 复杂度分析

- 时间复杂度：O( )
- 空间复杂度：O( )