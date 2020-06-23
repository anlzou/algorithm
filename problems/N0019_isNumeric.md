<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-23 15:05:02
 * @FilePath    : \algorithm\problems\N0019_isNumeric.md
 * @Describe    : 
 -->
## 题目地址

[nowcoder](https://www.nowcoder.com/practice/6f8c901d091949a5837e24bb82a731f2?tpId=13&tqId=11206&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking&from=cyc_github)

## 题目描述

问题：
```
请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
```
示例：
```
字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 
但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
```

## 思路
使用正则表达式进行匹配。
```
[]  ： 字符集合
()  ： 分组
?   ： 重复 0 ~ 1 次
+   ： 重复 1 ~ n 次
*   ： 重复 0 ~ n 次
.   ： 任意字符
\\. ： 转义后的 .
\\d ： 数字
```

## 关键点
正则表达式

## 代码
- [N0019_IsNumeric.java](../code/N0019_IsNumeric.java)

## 复杂度分析

- 时间复杂度：O( )
- 空间复杂度：O( )