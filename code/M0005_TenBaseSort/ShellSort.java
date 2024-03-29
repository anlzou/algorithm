/**
 * @Date : 2020-05-11 08:22:25
 * @LastEditors : anlzou
 * @Github : https://github.com/anlzou
 * @LastEditTime: 2020-05-11 08:49:19
 * @FilePath    : \algorithm\code\M0005_TenBaseSort\ShellSort.java
 * @Describe :
 */
package code.M0005_TenBaseSort;

import java.util.Arrays;

public class ShellSort implements IArraySort {
    @Override
    public int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        int gap = 1;
        while (gap < arr.length) {
            gap = gap * 3 + 1;
        }

        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                int tmp = arr[i];
                int j = i - gap;
                while (j >= 0 && arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = tmp;
            }
            gap = (int) Math.floor(gap / 3);
        }
        return arr;
    }

    // 第二种写法，是第一种的未优化版
    /**
     * Hibbard增量和Sedgewick增量。 Hibbard的增量序列如下： 1，3，7，15...... 通项公式 2^k-1
     * 利用此种增量方式的希尔排序，最坏时间复杂度是O（n^(3/2)）
     * 
     * Sedgewick的增量序列如下： 1, 5, 19, 41, 109...... 通项公式 9*4^k - 9*2^k + 1 或者 4^k -
     * 3*2^k + 1 利用此种增量方式的希尔排序，最坏时间复杂度是O（n^(4/3)）
     * 
     * 关于这两种增量方式的时间复杂度，有些需要很复杂的数学证明，有些是人们的大致猜想，大家暂时不用纠结。
     * 
     * @param array
     */
    public static void sort2(int[] array) {// 希尔排序的增量
        int d = array.length;
        while (d > 1) { // 使用希尔增量的方式，即每次折半
            d = d / 2;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < array.length; i = i + d) {
                    int temp = array[i];
                    int j;
                    for (j = i - d; j >= 0 && array[j] > temp; j = j - d) {
                        array[j + d] = array[j];
                    }
                    array[j + d] = temp;
                }
            }
        }
    }
}