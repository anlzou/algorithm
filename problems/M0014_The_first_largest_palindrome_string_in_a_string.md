<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-08-08 16:55:01
 * @FilePath    : \algorithm\problems\M0014_The_first_largest_palindrome_string_in_a_string.md
 * @Describe    : 
 -->
## 题目地址

## 题目描述

问题：
```
任意输入内容的首个最长回文段
```
示例：
```
输入：dscdsdsad
输出：dsd
```

## 思路
1. 字符串从左往右选择回文串中心点
2. 如果为奇回文（中心点左右两边相等），则回文串为`string[index-1]+index_string+string[index+1]`; 如果为偶回文, 则回文串为`string[index-1]+index_string`
3. 取最大回文串

## 关键点
- 取中心点

## 代码
- [demo](../code/M0014_first_largest_palindrome_string/index.html)
- [M0014_The_first_largest_palindrome_string_in_a_string.js](../code/M0014_first_largest_palindrome_string/M0014_The_first_largest_palindrome_string_in_a_string.js)

## 复杂度分析

- 时间复杂度：O(n*n)
- 空间复杂度：O(len(string))