<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-02 20:43:01
 * @FilePath    : \algorithm\templates\problems.md
 * @Describe    : 
 -->
## 题目地址

[0～n-1中缺失的数字]([que-shi-de-shu-zi-lcof](https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/?utm_source=LCUS&utm_medium=ip_redirect&utm_campaign=transfer2china))

## 题目描述

问题：
```
Q?

一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
```
示例：
```
A.

输入: [0,1,3]
输出: 2

输入: [0,1,2,3,4,5,6,7,9]
输出: 8
```

## 思路
解题思路有n种，但是我们应该使用效果更好的：
1. 直接暴力求解，后一个数是前一个数+1。时间复杂度为O(n)，不适合大计算。
2. 使用数学的规律求解，等比/等差求和然后减去数组的和。该方法时间复杂度为O(n)，不适合大计算。
3. 使用XOR（异或，即位运算），两两相同则抵消，剩下单个的值。时间复杂度为O(N)
4. 使用[二分法](https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/solution/mian-shi-ti-53-ii-0n-1zhong-que-shi-de-shu-zi-er-f/)，第 `num[len/2] = len/2`，如果不等则缺少的数在前半段数组中，相等则在后半段，调整 `len` 值，继续分组查找。该方法时间复杂度为O(logN)。

## 关键点


## 代码
- [L0009_TheLostNumOnArray.py](../../code/code_leetcode/L0009_TheLostNumOnArray.py)

## 复杂度分析

- 时间复杂度best：O(longN)
- 空间复杂度：O(1)