/**
 * @Date : 2020-06-08 15:15:29
 * @LastEditors : anlzou
 * @Github : https://github.com/anlzou
 * @LastEditTime: 2020-06-08 15:38:51
 * @FilePath    : \algorithm\code\M0010_RotateString.java
 * @Describe :
 */
package code;

import java.util.Arrays;

public class M0010_RotateString {
    /**
     * 第一种方法，暴力法
     */
    public boolean rotateString(String A, String B) {
        if (A.equals("") && B.equals("")) {
            return true;
        }
        int len = A.length();
        for (int i = 0; i < len; i++) {
            String first = A.substring(0, 1);
            String last = A.substring(1, len);
            A = last + first;
            if (A.equals(B)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 第二种方法，B 是否在 A+A 中
     */
    public boolean rotateString2(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }

    /**
     * 第三种方法，KMP算法
     */
    public boolean rotateStringKMP(String A, String B) {
        int N = A.length();
        if (N != B.length())
            return false;
        if (N == 0)
            return true;
        int[] shifts = new int[N + 1];
        Arrays.fill(shifts, 1);
        int left = -1;
        for (int right = 0; right < N; ++right) {
            while (left >= 0 && (B.charAt(left) != B.charAt(right)))
                left -= shifts[left];
            shifts[right + 1] = right - left++;
        }

        // Find match of B in A+A
        int matchLen = 0;
        for (char c : (A + A).toCharArray()) {
            while (matchLen >= 0 && B.charAt(matchLen) != c)
                matchLen -= shifts[matchLen];
            if (++matchLen == N)
                return true;
        }
        return false;
    }

    /* ======================test===================== */
    public static void main(String[] args) {
        M0010_RotateString test = new M0010_RotateString();
        String A = "abcdef", B = "cdefab";

        System.out.println(test.rotateString(A, B));
        System.out.println(test.rotateString2(A, B));
        System.out.println(test.rotateStringKMP(A, B));
    }
}