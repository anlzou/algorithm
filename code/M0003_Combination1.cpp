
/***
 * @Date        : 2020-05-03 08:54:52
 * @LastEditors: anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-03 08:54:52
 * @FilePath    : \algorithm\code\M0003_Combination1.cpp
 * @Describe    :
 */
#include <cstdio>
#include <ctime>
#include <iostream>
using namespace std;
const int num = 100;
int a[num];

void combination(int n, int r) {
    for (int i = n; i >= r; i--) {
        a[r] = i;
        if (r > 1)
            combination(i - 1, r - 1);
        else {
            for (int j = a[0]; j > 0; j--) printf("%d ", a[j]);
            printf("\n");
        }
    }
}

int main() {
    int n, r;
    while (scanf("%d%d", &n, &r)) {
        clock_t startTime, endTime;
        startTime = clock();  //计时开始
        if (r > n)
            printf("input error!");
        else {
            a[0] = r;
            combination(n, r);
        }
        endTime = clock();  //计时结束
        cout << "The run time is: "
             << (double)(endTime - startTime) / CLOCKS_PER_SEC << "s" << endl;
    }
    return 0;
}