<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-28 23:40:34
 * @FilePath    : \algorithm\problems\M0007_CocktailSort.md
 * @Describe    : 
 -->
## 题目地址

[15 种排序算法可视化展示](https://www.runoob.com/w3cnote/15-sorting-algorithms-visually-displayed.html)

## 题目描述

问题：
```
鸡尾酒排序Cocktail Sort （双向冒泡排序）
```

## 思路
鸡尾酒排序思路，先从左边开始进行冒泡排序，第一趟冒泡排序完，最大值在的数组的最右端，然后进行第二趟排序，第二趟排序从右边开始排序，第二趟结束时，最小值在数组最左端，以此类推，每一趟排序完都能将一个在当前数组（不包括之前排序得到的最大或者最小的数）中最小或者最大的数放在对应的位置。


## 关键点
- 冒泡排序
- 双向冒泡

## 代码
[M0007_CocktailSort.cpp](../code/M0007_CocktailSort.cpp)

## 复杂度分析

- 时间复杂度：O(2N)
- 空间复杂度：O(N)