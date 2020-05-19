/**
 * @Date        : 2020-05-19 15:20:57
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-19 16:34:24
 * @FilePath    : \algorithm\code\N0004_FindingIn2dArray.java
 * @Describe    : 
 */
package code;

public class N0004_FindingIn2dArray {
    public boolean find(int target, int[][] matrix) {
        boolean res = false;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return res;
        int rows = matrix.length, cols = matrix[0].length;
        int row = rows - 1, col = 0; // 从左下角开始
        while (row >= 0 && col < cols) {
            if (target < matrix[row][col])
                row--;
            else if (target > matrix[row][col])
                col++;
            else {
                res = true;
                break;
            }
        }
        return res;
    }

}
