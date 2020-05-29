/**
 * @Date : 2020-05-29 08:43:48
 * @LastEditors : anlzou
 * @Github : https://github.com/anlzou
 * @LastEditTime: 2020-05-29 09:08:30
 * @FilePath    : \algorithm\test\Test.java
 * @Describe :
 */
package test;

public class Test {
    public static void ShellSort(int arr[]) {
        int h = 1;
        int step = arr.length;

        // 找到最大饱和子序列长度
        while (h < step / 3) {
            h = h * 3 + 1;
        }

        // 优化
        int exchanges = 0;
        for (int index = step - 1; index > 0; index--) {
            if (arr[index] < arr[index] - 1) {
                int temp;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                exchanges++;
            }
        }

        // 若交换次数为0(即数组有序)，则无需进行下了一轮排序
        if (exchanges == 0)
            return;
        while (h >= 1) {
            for (int indexI = h; indexI < step; indexI++) {
                int temp = arr[indexI];
                int indexJ = indexI;
                while (indexJ >= h && (temp < arr[indexJ - h])) {
                    arr[indexJ] = arr[indexJ - h];
                    indexJ -= h;
                }
                arr[indexJ] = temp;
            }
            h = h / 3;
        }
    }

}
