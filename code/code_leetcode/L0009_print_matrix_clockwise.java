/**
 * @Date : 2020-10-24 19:11:42
 * @LastEditors : anlzou
 * @Github : https://github.com/anlzou
 * @LastEditTime: 2020-10-24 20:15:09
 * @FilePath    : \algorithm\code\code_leetcode\L0009_print_matrix_clockwise.java
 * @Describe :
 */
package code.code_leetcode;

import java.util.ArrayList;

public class L0009_print_matrix_clockwise {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        int row_begin = 0, row_end = matrix.length - 1; // 行
        int column_begin = 0, column_end = matrix[0].length - 1; // 列

        while (row_begin <= row_end && column_begin <= column_end) {
            for (int i = column_begin; i <= column_end; i++)
                /**
                 * { 1:[1,2,3,4] 2:[6,7] }
                 */
                ret.add(matrix[row_begin][i]);
            for (int i = row_begin + 1; i <= row_end; i++)
                /**
                 * { 1:[8,12,16], 2:[11], 3: }
                 */
                ret.add(matrix[i][column_end]);
            if (row_begin != row_end)
                for (int i = column_end - 1; i >= column_begin; i--)
                    /**
                     * { 1:[15,14,13], 2:[10]}
                     */
                    ret.add(matrix[row_end][i]);
            if (column_begin != column_end)
                for (int i = row_end - 1; i > row_begin; i--)
                    /**
                     * 1:[9,5]
                     */
                    ret.add(matrix[i][column_begin]);
            row_begin++;
            row_end--;
            column_begin++;
            column_end--;
        }
        return ret;
    }
}
