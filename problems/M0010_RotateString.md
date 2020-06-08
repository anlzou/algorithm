<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-08 15:38:23
 * @FilePath    : \algorithm\problems\M0010_RotateString.md
 * @Describe    : 
 -->
## 题目地址

[必须掌握的超高频旋转算法题目！](https://mp.weixin.qq.com/s/L1d9mIdXiUvxxm-YHdUoFg)

## 题目描述

问题：
```
给定两个字符串, A 和 B。A 的旋转操作就是将 A 最左边的字符移动到最右边。
例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。
如果在若干次旋转操作之后，A 能变成B，那么返回True。

注意：A 和 B 长度不超过 100。
```
示例：
```
# 1:
输入: A = 'abcde', B = 'cdeab'
输出: true

# 2:
输入: A = 'abcde', B = 'abced'
输出: false
```

## 思路
#1

题目的意思是把一个字符串，假设是 A，分为两段 (first[0...len-1]，last[1...len])，把 last+first 从新拼接为一个新的字符串和 B 比较是否相同。

即暴力法，使用循环为一种方法。

#2

暴力法代码并不优雅。因为 <code>A + A</code> 包含了所有可以通过旋转操作从 A 得到的字符串，所以只需要判断 B 是否是 <code>A + A</code> 的子串即可。

#3

深入算法 KMP，SUNDAY，BF 等字符串匹配策略。（当然，这里其实 SUNDAY 并不是特别适合）

## 补充
<code>public boolean contains(CharSequence s)</code>
```
当且仅当此字符串包含指定的char值序列时才返回true。 

参数 
s - 搜索的顺序 

结果 
如果此字符串包含 s ，则为true，否则为false 
```

## 代码
- [M0010_RotateString.java](../code/M0010_RotateString.java)

## 复杂度分析

- 时间复杂度：O( )
- 空间复杂度：O( )