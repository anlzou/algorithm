<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-02 20:43:01
 * @FilePath    : \algorithm\templates\problems.md
 * @Describe    : 
 -->
## 题目地址

[fucking-algorithm](https://github.com/labuladong/fucking-algorithm/blob/master/%E9%AB%98%E9%A2%91%E9%9D%A2%E8%AF%95%E7%B3%BB%E5%88%97/%E6%89%93%E5%8D%B0%E7%B4%A0%E6%95%B0.md)

## 题目描述

问题：
```
素数的定义看起来很简单，如果一个数如果只能被 1 和它本身整除，那么这个数就是素数。

求2到n内的素数以及个数。
```
示例：
```
Q:
[2, 25)

A:
9
[[2, True], [3, True], [4, False], [5, True], [6, False], [7, True], [8, False], [9, False], [10, False], [11, True], [12, False], [13, True], [14, False], [15, False], [16, False], [17, True], [18, False], [19, True], [20, False], [21, False], [22, False], [23, True], [24, False]]

demo：
[2,1000000)
count primes: 78498
pass time: 0.784867525100708
last one: [[999999, False]]
```

## 思路
使用 `Sieve of Eratosthenes`算法

## 关键点
零界点sqrt(n)，`i < Sqrt(n)` 等同于 `i*i < n`

## 代码
- [M0015_how_much_primes.py](../../code/code_myself/M0015_how_much_primes.py)

## 复杂度分析

- 时间复杂度：O(N*sqrt(N))
- 空间复杂度：O(N)
