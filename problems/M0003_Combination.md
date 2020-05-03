<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-03 08:58:25
 * @FilePath    : \algorithm\problems\M0003_Combination.md
 * @Describe    : 
 -->
## 题目地址

[...](#)

## 题目描述

问题：
```
找出从自然数1、2、... 、n（0\<n\<10）中任取r(0\<r\<=n)个数的所有组合。从大到小输出。（从小到大输出同理）
```
示例：
```
n = 6
r = 3
```
结果：
```
$01 [1,2,3]		$02 [1,2,4]		$03 [1,2,5]		$04 [1,2,6]		$05 [1,3,4]
$06 [1,3,5]		$07 [1,3,6]		$08 [1,4,5]		$09 [1,4,6]		$10 [1,5,6]
$11 [2,3,4]		$12 [2,3,5]		$13 [2,3,6]		$14 [2,4,5]		$15 [2,4,6]
$16 [2,5,6]		$17 [3,4,5]		$18 [3,4,6]		$19 [3,5,6]		$20 [4,5,6]
```

## 思路
#1[递归算法](https://blog.csdn.net/weixin_40571331/article/details/82848341)
1. 先固定每组组合的第一个数字
2. 利用递归再固定下一个数字，类似于树状结构，照此类推
3. 递归跳出条件r = 1

#2[深度遍历(也属递归算法)](https://blog.csdn.net/weixin_40571331/article/details/82848341)

#3[速度暴快的组合生成算法](https://blog.csdn.net/medie2005/article/details/1812190?depth_1-utm_source=distribute.pc_relevant.none-task-blog-OPENSEARCH-12&utm_source=distribute.pc_relevant.none-task-blog-OPENSEARCH-12)

## 关键点


## 代码
C++：
- [M0003_Combination1.cpp](./../code/M0003_Combination1.cpp)
- [M0003_Combination2.cpp](./../code/M0003_Combination2.cpp)
- [M0003_Combination3.cpp](./../code/M0003_Combination3.cpp)


## 复杂度分析

- 时间复杂度：O()
- 空间复杂度：O()