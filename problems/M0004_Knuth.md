<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-02 20:43:01
 * @FilePath    : \algorithm\templates\problems.md
 * @Describe    : 
 -->
## 题目地址

[这或许是讲解 Knuth 洗牌算法最好的文章](https://mp.weixin.qq.com/s/OipavTRvi98WKLfnSSnJLQ)

## 题目描述

设计一个公平的洗牌算法

## 思路
公平是指，对于生成的排列，每一个元素都能等概率地出现在每一个位置。或者反过来，每一个位置都能等概率地放置每个元素。

## 关键点
Knuth-Shuffle，即 Knuth 洗牌算法。

## 代码
```python
for(int i = n - 1; i >= 0 ; i -- )
    swap(arr[i], arr[rand(0, i)]) // rand(0, i) 生成 [0, i] 之间的随机整数
```

## 复杂度分析

- 时间复杂度：O(N)
- 空间复杂度：O(N)

## 用处
这个算法除了洗牌，还能怎么用？



其实，在很多随机的地方，都能使用。比如，扫雷生成随机的盘面。我们可以把扫雷的二维盘面先逐行连接，看作是一维的。之后，把 k 颗雷依次放在开始的位置。
然后，我们运行一遍 Knuth 洗牌算法，就完成地雷的随机位置。