/**
 * @Date : 2020-06-17 20:11:29
 * @LastEditors : anlzou
 * @Github : https://github.com/anlzou
 * @LastEditTime: 2020-06-17 20:18:35
 * @FilePath    : \algorithm\code\N0018_IntegerPowerOfValue.java
 * @Describe :
 */
package code;

public class N0018_IntegerPowerOfValue {
    public double Power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;

        boolean isNegative = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNegative = true;// 标记负数
        }
        double pow = Power(base * base, exponent / 2);// exponent为偶数

        if (exponent % 2 != 0)// exponent为奇数
            pow = pow * base;

        return isNegative ? 1 / pow : pow;
    }

    /* =================test=================== */
    public static void main(String[] args) {
        N0018_IntegerPowerOfValue test = new N0018_IntegerPowerOfValue();
        double base = -10.2;
        int exponent = -5;

        System.out.println(test.Power(base, exponent));
    }
}