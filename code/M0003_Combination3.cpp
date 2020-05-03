
/***
 * @Date        : 2020-05-03 08:55:30
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-03 08:55:31
 * @FilePath    : \algorithm\code\M0003_Combination3.cpp
 * @Describe    :
 */
#include <cstdlib>
#include <ctime>
#include <iostream>
using namespace std;

void combination(int n, int m) {
    int* A = new int[n + 1];
    int* B = new int[m + 1];
    int i, j;
    for (i = 1; i <= n; ++i) A[i] = i;
    for (i = 1; i <= m; ++i) B[i] = m;
    while (B[1] < n) {
        for (i = 1; i <= m; ++i) cout << A[i] << " ";
        cout << endl;
        j = m;
        while (B[j] == n) --j;
        ++B[j];
        for (i = j + 1; i <= m; ++i) B[i] = B[j];
        swap(A[j], A[B[j]]);
    }
    delete[] A;
    delete[] B;
}
int main(int argc, char* argv[]) {
    int n, r;
    while (~scanf("%d%d", &n, &r)) {
        clock_t startTime, endTime;
        startTime = clock();  //计时开始
        combination(n, r);
        endTime = clock();  //计时结束
        cout << "The run time is: "
             << (double)(endTime - startTime) / CLOCKS_PER_SEC << "s" << endl;
    }
    system("PAUSE");
    return EXIT_SUCCESS;
}