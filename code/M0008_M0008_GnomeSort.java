/**
 * @Date        : 2020-05-29 09:25:05
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-29 09:28:51
 * @FilePath    : \algorithm\code\M0008_M0008_GnomeSort.java
 * @Describe    : 
 */
package code;

public class M0008_M0008_GnomeSort {
    void gnomeSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i == 0 || arr[i - 1] <= arr[i]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i--;
            }
        }
    }

    public static void main(String[] args) {
        M0008_M0008_GnomeSort test = new M0008_M0008_GnomeSort();
        int arr[] = { 3, 2, 4, 5, 6, 1 };
        test.gnomeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}