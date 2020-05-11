/**
 * @Date        : 2020-05-06 09:44:28
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-11 08:31:30
 * @FilePath    : \algorithm\test\Test.java
 * @Describe    : 
 */

package test;

import java.util.Arrays;

import code.M0005_TenBaseSort.*;

public class Test {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 6, 7, 4, 8, 9 };
        // SelectionSort selectionSort = new SelectionSort();
        InsertSort insertSort = new InsertSort();

        int[] array = { 5, 3, 9, 12, 6, 1, 7, 2, 4, 11, 8, 10 };
        ShellSort.sort2(array);// sort2是static的
        System.out.println(Arrays.toString(array));

        try {
            // int[] ans = selectionSort.sort(arr);
            int[] ans = insertSort.sort(arr);

            for (int i : ans) {
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
