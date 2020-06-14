<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-14 16:17:00
 * @FilePath    : \algorithm\problems\N0016_cut-the-rope.md
 * @Describe    : 
 -->
## 题目地址

[leetcode](https://leetcode-cn.com/problems/jian-sheng-zi-lcof/)

## 题目描述

问题：
```
把一根绳子剪成多段，并且使得每段的长度乘积最大。
```
示例：
```
n = 2
return 1 (2 = 1 + 1)

n = 10
return 36 (10 = 3 + 3 + 4)
```

## 思路
#贪心

尽可能多剪长度为 3 的绳子，并且不允许有长度为 1 的绳子出现。如果出现了，就从已经切好长度为 3 的绳子中拿出一段与长度为 1 的绳子重新组合，把它们切成两段长度为 2 的绳子。

#[动态规划 - algorithm-design-and-analysis / chapter08-dynamic-programming](https://github.com/anlzou/algorithm-design-and-analysis/blob/master/chapters/chapter08-dynamic-programming/test8-1.md)

[拒绝遗忘：高效的动态规划算法](https://baijiahao.baidu.com/s?id=1635388976060265522&wfr=spider&for=pc)

证明：当 n >= 5 时，3(n - 3) - n = 2n - 9 > 0，且 2(n - 2) - n = n - 4 > 0。因此在 n >= 5 的情况下，将绳子剪成一段为 2 或者 3，得到的乘积会更大。又因为 3(n - 3) - 2(n - 2) = n - 5 >= 0，所以剪成一段长度为 3 比长度为 2 得到的乘积更大。

## 关键点
- 归纳推理
- 自底向上

## 代码
- [N0016_CutTheRope.java](../code/N0016_CutTheRope.java)

## 复杂度分析

- 时间复杂度：O( )
- 空间复杂度：O( )