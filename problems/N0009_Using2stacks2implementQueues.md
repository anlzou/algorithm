<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-27 10:59:25
 * @FilePath    : \algorithm\problems\N0009_Using2stacks2implementQueues.md
 * @Describe    : 
 -->
## 题目地址

[nowcoder](https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?tpId=13&tqId=11158&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking&from=cyc_github)

## 题目描述

问题：
```
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
```

## 思路
in 栈用来处理入栈（push）操作，out 栈用来处理出栈（pop）操作。一个元素进入 in 栈之后，出栈的顺序被反转。当元素要出栈时，需要先进入 out 栈，此时元素出栈顺序再一次被反转，因此出栈顺序就和最开始入栈顺序是相同的，先进入的元素先退出，这就是队列的顺序。

## 关键点
- Stack：后进先出，拟物为杯子
  - [java stack的详细实现分析](https://blog.csdn.net/qq_35124535/article/details/71487479?utm_medium=distribute.pc_relevant.none-task-blog-baidujs-2)
  - [anlzou / data-structure / 栈的基本操作](https://github.com/anlzou/data-structure/blob/master/chapters/chapter03-stacks-and-queues/test-1.md)
- Queues：先进先出，拟物为管道


## 代码
[N0009_Using2stacks2implementQueues.java](../code/N0009_Using2stacks2implementQueues.java)

[Test_N0009.java](../test/Test_N0009.java)

## 复杂度分析

- 时间复杂度：O(N)
- 空间复杂度：O(2N)