<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-02 20:43:01
 * @FilePath    : \algorithm\templates\problems.md
 * @Describe    : 
 -->
## 题目地址

[https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)

## 题目描述

问题：
```
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
```
示例：
```
#1 
输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

#2
输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

#3
输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
```

## 思路
#1
建立一个256位大小的整型数组 freg ，用来建立字符和其出现位置之间的映射。

维护一个滑动窗口，窗口内的都是没有重复的字符，去尽可能的扩大窗口的大小，窗口不停的向右滑动。

- （1）如果当前遍历到的字符从未出现过，那么直接扩大右边界；
- （2）如果当前遍历到的字符出现过，则缩小窗口（左边索引向右移动），然后继续观察当前遍历到的字符；
- （3）重复（1）（2），直到左边索引无法再移动；
- （4）维护一个结果res，每次用出现过的窗口大小来更新结果 res，最后返回 res 获取结果。

#2
[LeetCodeAnimation](https://github.com/MisterBooo/LeetCodeAnimation/blob/master/notes/LeetCode%E7%AC%AC3%E5%8F%B7%E9%97%AE%E9%A2%98%EF%BC%9A%E6%97%A0%E9%87%8D%E5%A4%8D%E5%AD%97%E7%AC%A6%E7%9A%84%E6%9C%80%E9%95%BF%E5%AD%90%E4%B8%B2.md)
## 关键点
- 用一个 mapper 记录出现过并且没有被删除的字符
- 用一个滑动窗口记录当前 index 开始的最大的不重复的字符序列
- 用 res 去记录目前位置最大的长度，每次滑动窗口更新就去决定是否需要更新 res

## 代码
#1 [L0003_LongestSubstringWithoutRepeatingCharacters.cpp](../code/L0003_LongestSubstringWithoutRepeatingCharacters.cpp)

#2 [L0003_LongestSubstringWithoutRepeatingCharacters.js](../code/L0003_LongestSubstringWithoutRepeatingCharacters.js)

#3 [L0003_LongestSubstringWithoutRepeatingCharacters.py](../code/L0003_LongestSubstringWithoutRepeatingCharacters.py)

## 复杂度分析

- 时间复杂度：O(len(s))
- 空间复杂度：O(len(charset))