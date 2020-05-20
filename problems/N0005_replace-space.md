<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-20 11:39:08
 * @FilePath    : \algorithm\problems\N0005_replace-space.md
 * @Describe    : 
 -->
## 题目地址

[nowcoder](https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 题目描述

问题：
```
将一个字符串中的空格替换成 "%20"。
```
示例：
```
Input:
"A B C D"

Output:
"A%20B%20C%20D"
```

## 思路
1. 在字符串尾部填充任意字符，使得字符串的长度等于替换之后的长度。因为一个空格要替换成三个字符（%20），所以当遍历到一个空格时，需要在尾部填充两个任意字符。

2. 令 P1 指向字符串原来的末尾位置，P2 指向字符串现在的末尾位置。P1 和 P2 从后向前遍历，当 P1 遍历到一个空格时，就需要令 P2 指向的位置依次填充 02%（注意是逆序的），否则就填充上 P1 指向字符的值。从后向前遍是为了在改变 P2 所指向的内容时，不会影响到 P1 遍历原来字符串的内容。

3. 当 P2 遇到 P1 时（P2 <= P1），或者遍历结束（P1 < 0），退出。

## 关键点
- 逆序
- 替换

## 代码
[N0005_ReplaceSpace.java](/code/N0005_ReplaceSpace.java)

[Test_N0005.java](../test/Test_N0005.java)

## 补充
[Java StringBuffer 和 StringBuilder 类](https://www.runoob.com/java/java-stringbuffer.html)

## 复杂度分析

- 时间复杂度：O(N)
- 空间复杂度：O(N)