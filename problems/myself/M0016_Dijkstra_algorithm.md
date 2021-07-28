<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-02 20:43:01
 * @FilePath    : \algorithm\templates\problems.md
 * @Describe    : 
 -->
## 题目地址

- [Dijkstra算法详解 通俗易懂](https://zhuanlan.zhihu.com/p/338414118)

## 题目描述
迪杰斯特拉（Dijkstra） 算法是求一个图中一个点到其他所有点的最短路径的算法，阅读前请想了解图的数据结构「邻接矩阵」。

## 思路
Dijkstra 算法是一个基于「贪心」、「广度优先搜索」、「动态规划」求一个图中一个点到其他所有点的最短路径的算法。

## 关键点
每次从 「未求出最短路径的点」中 **取出** 距离距离起点 **最小路径的点**，以这个点为桥梁 **刷新**「未求出最短路径的点」的距离。

## 代码
- [M0016_Dijkstra_algorithm.java](../../code/code_myself/M0016_Dijkstra_algorithm.java)

## 复杂度分析

- 时间复杂度：O(N^2)
- 空间复杂度：O(N)