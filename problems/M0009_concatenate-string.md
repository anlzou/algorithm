<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-01 23:50:40
 * @FilePath    : \algorithm\problems\M0009_concatenate-string.md
 * @Describe    : 
 -->
## 题目地址
C语言中动态拼接变量到字符串中

## 题目描述

问题：
```
拼接变量到字符串中，避免使用字符串数组保存字符串。
```
示例：
```c++
"Time is" + char(8) + "a clock."
```

## 思路
在C语言中没有字符串，所以可以使用
```c++
#include <stdio.h>
int sprintf( char *buffer, const char *format, ... );
```
sprintf()函数和printf()类似, 只是把输出发送到buffer(缓冲区)中.返回值是写入的字符数量. 例如: 
```c++
char string[50];
int file_number = 0;

sprintf( string, "file.%d", file_number );
file_number++;
output_file = fopen( string, "w" );
```

## 关键点


## 代码


## 复杂度分析

- 时间复杂度：O(N)
- 空间复杂度：O(N)