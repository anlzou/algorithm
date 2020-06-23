/**
 * @Date        : 2020-06-23 15:00:08
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-23 15:04:25
 * @FilePath    : \algorithm\code\N0019_isNumeric.java
 * @Describe    : 
 */
package code;

public class N0019_IsNumeric {
    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0)
            return false;
        return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
    }
}