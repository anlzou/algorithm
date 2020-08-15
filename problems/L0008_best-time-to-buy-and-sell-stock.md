<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-08-15 23:28:38
 * @FilePath    : \algorithm\problems\L0008_best-time-to-buy-and-sell-stock.md
 * @Describe    : 
 -->
## 题目地址

[leetcode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)

## 题目描述

问题：
```
假设您有一个数组，第i个元素是第i天给定股票的价格。
如果只允许您最多完成一笔交易（即买入和卖出一股股票），则设计一种算法以找到最大的利润。
请注意，您不能在买股票之前卖出股票。
```
示例：
```
Example 1:

Input: [7,1,5,3,6,4]
Output: 5
说明：在第2天买入（价格= 1）并在第5天卖出（价格= 6），利润= 6-1 = 5。
不是7-1 = 6，因为销售价格必须大于购买价格。

Example 2:

Input: [7,6,4,3,1]
Output: 0
说明：在这种情况下，不执行任何交易，即最大利润= 0。
```

## 思路
由于我们是想获取到最大的利润，我们的策略应该是低点买入，高点卖出。

由于题目对于交易次数有限制，只能交易一次，因此问题的本质其实就是求波峰浪谷的差值的最大值。

## 关键点
- 数组

## 代码
- [L0008_BT2BASS.py](../code/L0008_BT2BASS.py)

## 复杂度分析

- 时间复杂度：O(N)
- 空间复杂度：O(N)