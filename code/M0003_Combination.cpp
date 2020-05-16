/***
 * @Date        : 2020-05-16 14:27:58
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-16 14:28:43
 * @FilePath    : \algorithm\code\M0003_Combination.cpp
 * @Describe    :
 */
#include <cstdio>
#include <ctime>
#include <iostream>
using namespace std;

class M0003_Combination {
   private:
    static const int num = 100;
    int r;

   public:
    //第一种组合计算
    int a[num];
    void combination1(int n, int r) {
        for (int i = n; i >= r; i--) {
            a[r] = i;
            if (r > 1)
                combination1(i - 1, r - 1);
            else {
                for (int j = a[0]; j > 0; j--) printf("%d ", a[j]);
                printf("\n");
            }
        }
    }

    //第二种组合计算
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

    //第三种组合计算
    void combination2(int n, int m) {
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
};

int main() {
    int n, r;
    M0003_Combination test = M0003_Combination();
    while (scanf("%d%d", &n, &r)) {
        clock_t startTime, endTime;
        startTime = clock();  //计时开始
        if (r > n)
            printf("input error!");
        else {
            test.a[0] = r;
            test.combination1(n, r);
        }
        endTime = clock();  //计时结束
        cout << "The run time is: "
             << (double)(endTime - startTime) / CLOCKS_PER_SEC << "s" << endl;
    }
    return 0;
}