<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-17 10:11:03
 * @FilePath    : \algorithm\problems\L0007_reverse-integer.md
 * @Describe    : 
 -->
## 题目地址

[leetcode](https://leetcode-cn.com/problems/reverse-integer/)

## 题目描述

问题：
```
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
```
示例：
```
#1
输入: 123
输出: 321

#2
输入: -123
输出: -321

#3
输入: 120
输出: 21
```
注意：
```
假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
```
## 思路
很简单，就是输入整数，输出它的倒置。

1. 先取余得到个位的数，再除以 10 去掉个位数，然后用一个变量保存倒置的数<code> rev = rev * 10 + pop</code> 。

2. 但是需要考虑int类型的长度，int 的范围是 [-2^31 ,2^31-1] 也就是 [-2147483648,2147483647][−2147483648,2147483647] ，需要判断是否溢出。

[有两种思路](https://leetcode.wang/leetCode-7-Reverse-Integer.html)：

#1

rev取int类型，判断rev是否越界。
```
int rev = 0;
if (rev > Integer.MAX_VALUE/10 ) return 0;
if (rev < Integer.MIN_VALUE/10 ) return 0;
```

#2

rev取long类型，判断rev是否在范围内。
```
if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE ) return 0;
```

## 关键点
- Integer.MAX_VALUE
- Integer.MIN_VALUE

## 代码
[L0007_ReverseInteger.java](../code/L0007_ReverseInteger.java)

## 复杂度分析

- 时间复杂度：O( log(x) )
- 空间复杂度：O(N)