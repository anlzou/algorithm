/**
 * @Date        : 2020-06-17 21:45:34
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-17 21:47:02
 * @FilePath    : \algorithm\code\M0011_Print1ToMaxOfNDigits.java
 * @Describe    : 
 */
package code;

public class M0011_Print1ToMaxOfNDigits {
    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;
        char[] number = new char[n];// n为长度
        print1ToMaxOfNDigits(number, 0);
    }

    private void print1ToMaxOfNDigits(char[] number, int digit) {
        if (digit == number.length) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            /**
             * (i + '0') instanceof String //true. number[digit] = 0~9
             */
            number[digit] = (char) (i + '0');
            print1ToMaxOfNDigits(number, digit + 1);
        }
    }

    private void printNumber(char[] number) {
        int index = 0;
        while (index < number.length && number[index] == '0')
            index++;
        while (index < number.length)
            System.out.print(number[index++]);
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 3;
        M0011_Print1ToMaxOfNDigits test = new M0011_Print1ToMaxOfNDigits();
        test.print1ToMaxOfNDigits(n);
    }
}