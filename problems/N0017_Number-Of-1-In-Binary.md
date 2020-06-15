<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-15 14:59:38
 * @FilePath    : \algorithm\problems\N0017_Number-Of-1-In-Binary.md
 * @Describe    : 
 -->
## 题目地址

[nowcoder](https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tqId=11164&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking&from=cyc_github)

## 题目描述

问题：
```
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
```

## 思路
#### #1 n&(n-1)

去除 n 的二进制中表示中的最左边的 1。
```java
n       : 10110100  //180
n-1     : 10110011  //179
n&(n-1) : 10110000

//伪代码
count = 0;
while(n != 0){
    count++;
    n &= (n-1);
    /**
     * n 为以下个值
     * ************
     * n = 10110000
     * n = 10100000
     * n = 10000000
     * n = 00000000
     * ************
     * */ 
}
```


#### #2 bitCount
public static int bitCount(int i)返回指定的int值的二进制补码二进制表示中的int数。 此功能有时称为人口数量 。 

参数 
```
i - 要对其位进行计数的值 
```
结果 
```
指定的int值的二进制补码二进制表示中的 int数。 
```

## 代码
- [N0017_NumberOf1InBinary.java](../code/N0017_NumberOf1InBinary.java)

## 补充
- [位运算n & (n-1)的妙用](https://blog.csdn.net/Mars_NAVY/article/details/19496459?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase)
- [n&(n-1)的用途](https://www.cnblogs.com/zy230530/p/6645431.html)

## 复杂度分析
#1
- 时间复杂度：O(M)，其中 M 表示 1 的个数。
- 空间复杂度：O(N)