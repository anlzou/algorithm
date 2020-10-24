/**
 * @Date        : 2020-10-24 19:22:59
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-10-24 20:39:41
 * @FilePath    : \algorithm\test\newcoder\Test_N0020.java
 * @Describe    : 
 */
package test.newcoder;

import java.util.ArrayList;

import code.code_nowcoder.N0020_print_matrix_clockwise;

public class Test_N0020 {
    public static void main(String[] args) {
        N0020_print_matrix_clockwise test = new N0020_print_matrix_clockwise();

        int[][] data = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        ArrayList<Integer> get_data = test.printMatrix(data);
        for (Integer integer : get_data) {
            System.out.println(integer);
        }
    }
}