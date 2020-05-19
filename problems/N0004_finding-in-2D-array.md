<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-19 16:54:55
 * @FilePath    : \algorithm\problems\N0004_finding-in-2D-array.md
 * @Describe    : 
 -->
## 题目地址

[nowcoder](https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 题目描述

问题：
```
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
```
示例：
```
Consider the following matrix:
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]

Given target = 5, return true.
Given target = 20, return false.
```

## 思路
要求时间复杂度 O(M + N)，空间复杂度 O(1)。其中 M 为行数，N 为 列数。

该二维数组中的一个数，大于它的数一定在其右边，小于它的数一定在其上边。

因此，从左下角开始查找，就可以根据 target 和当前元素的大小关系来缩小查找区间，当前元素的查找区间为右上角的所有元素。
## 关键点
- 数组切入点
- 规律

## 代码
- [N0004_FindingIn2dArray.java](./../code/N0004_FindingIn2dArray.java)

- [Test_N0004.java](./../test/Test_N0004.java)

## 复杂度分析

- 时间复杂度：O(M+N)
- 空间复杂度：O(1)