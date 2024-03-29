/**
 * @Date : 2020-05-29 08:43:48
 * @LastEditors : anlzou
 * @Github : https://github.com/anlzou
 * @LastEditTime: 2020-06-17 21:41:52
 * @FilePath    : \algorithm\test\Test.java
 * @Describe :
 */
package test;

public class Test {
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
        Test test = new Test();
        test.print1ToMaxOfNDigits(n);
    }

}
