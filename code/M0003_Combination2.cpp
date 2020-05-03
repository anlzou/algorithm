
/***
 * @Date        : 2020-05-03 08:55:22
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-03 08:55:23
 * @FilePath    : \algorithm\code\M0003_Combination2.cpp
 * @Describe    :
 */
#include <cstdio>
#include <ctime>
#include <iostream>
using namespace std;
const int num = 100;
int a[num], n, r;

void dfs(int n, int x) {
    if (x == r) {  //递归跳出条件：当数组存储的数字达到r时输出
        for (int i = 0; i < r; i++) printf("%d ", a[i]);
        printf("\n");
    }
    for (int i = n; i > 0; i--) {
        a[x] = i;
        dfs(i - 1, x + 1);
    }
}

int main() {
    while (~scanf("%d%d", &n, &r)) {
        clock_t startTime, endTime;
        startTime = clock();  //计时开始
        dfs(n, 0);
        endTime = clock();  //计时结束
        cout << "The run time is: "
             << (double)(endTime - startTime) / CLOCKS_PER_SEC << "s" << endl;
    }
    return 0;
}
