<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-10 07:52:32
 * @FilePath    : \algorithm\problems\M0006_SleepSort.md
 * @Describe    : 
 -->
## 题目地址
[那些代码量很少，但很牛X很经典的算法或项目案例](https://mp.weixin.qq.com/s/Z5-4YngUZoJSsGanjHTE5g)

## 题目描述
SleepSort

## 思路
1. 它原理是构造 n 个线程，它们和这 n 个数一一对应。
2. 初始化后，线程们开始睡眠，等到对应的数那么多个时间单位后各自醒来，然后输出它对应的数。
3. 这样最小的数对应的线程最早醒来，这个数最早被输出。
4. 等所有线程都醒来，排序就结束了。

## 关键点
Thread

## 代码
[M0006_SleepSort.java](../code/M0006_SleepSort.java)

## 复杂度分析

- 时间复杂度：O(无意义)
- 空间复杂度：O(N)