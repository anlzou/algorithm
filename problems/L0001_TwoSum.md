<!--
 * @Date        : 2020-05-02 20:16:19
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-17 22:00:26
 * @FilePath    : \algorithm\problems\L0001_TwoSum.md
 * @Describe    : 
 -->
## 题目地址

[leetcode](https://leetcode-cn.com/problems/two-sum)

## 题目描述

问题：
```
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
```
示例:
```
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
```

## 思路

#1 最容易想到的就是暴力枚举，我们可以利用两层 for 循环来遍历每个元素，并查找满足条件的目标元素。不过这样时间复杂度为 O(N^2)，空间复杂度为 O(1)，时间复杂度较高，我们要想办法进行优化。我们可以增加一个 Map 记录已经遍历过的数字及其对应的索引值。这样当遍历一个新数字的时候去 Map 里查询，target 与该数的差值是否已经在前面的数字中出现过。如果出现过，那么已经得出答案，就不必再往下执行了。 

#2 [LeetCodeAnimation](https://github.com/MisterBooo/LeetCodeAnimation/blob/master/notes/LeetCode%E7%AC%AC1%E5%8F%B7%E9%97%AE%E9%A2%98%EF%BC%9A%E4%B8%A4%E6%95%B0%E4%B9%8B%E5%92%8C.md)

## 关键点

- 求和转换为求差
- 借助 Map 结构将数组中每个元素及其索引相互对应
- 以空间换时间，将查找时间从 O(N) 降低到 O(1)

## 代码

#1 [L0001_TwoSum.js](./../code/L0001_TwoSum.js)

## 复杂度分析
- 时间复杂度：O(N)
- 空间复杂度：O(N)