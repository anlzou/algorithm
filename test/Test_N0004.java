/**
 * @Date        : 2020-05-06 09:44:28
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-19 16:50:56
 * @FilePath    : \algorithm\test\Test_N0004.java
 * @Describe    : 
 */

package test;

import java.util.Scanner;
import code.*;

public class Test_N0004 {
    public static int[][] a = new int[20][20];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input Rows and Cols:");
        int rows = scanner.nextInt(); // 行数
        int cols = scanner.nextInt(); // 列数

        int[][] arr;
        arr = new int[rows][]; // 动态创建第一维
        for (int i = 0; i < rows; i++) {
            arr[i] = new int[cols]; // 动态创建第二维
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        print2DArr(arr);

        N0004_FindingIn2dArray test = new N0004_FindingIn2dArray();
        System.out.printf("Find the number:");
        int number = scanner.nextInt();
        System.out.println(test.find(number, arr));

        scanner.close();
    }

    public static void print2DArr(int arr[][]) {
        int rows = arr.length, cols = arr[0].length;
        System.out.println("------------输入的数组------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
