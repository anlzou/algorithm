/*
 * @Date        : 2020-06-01 23:51:16
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-02 00:10:42
 * @FilePath    : \algorithm\code\M0009_ConcatenateString.c
 * @Describe    :
 */
#include <stdio.h>
#include <malloc.h>

int main() {
    char *str1 = "Time is ";
    char *str2 = " a clock";
    char *str3 = (char *)malloc(sizeof(str1) + sizeof(str2) + 4);

    printf("len str1: %d\n", sizeof(str1));  // 8
    printf("len str2: %d\n", sizeof(str2));  // 8
    int mun = 8;
    sprintf(str3, "%s%d%s", str1, mun, str2);
    printf("%s", str3);
    return 0;
}