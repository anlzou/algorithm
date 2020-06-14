/**
 * @Date        : 2020-06-14 15:19:24
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-06-14 15:35:11
 * @FilePath    : \algorithm\code\N0016_CutTheRope.java
 * @Describe    : 
 */
package code;

public class N0016_CutTheRope {
    /**
     * 贪心法
     */
    public int integerBreak_Greedy(int n) {
        if (n < 2)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int timesOf3 = n / 3;// 长度为3的数量
        if (n - timesOf3 * 3 == 1)// 如果余1
            timesOf3--;// 数量减1
        int timesOf2 = (n - timesOf3 * 3) / 2;// 长度为2的数量
        return (int) (Math.pow(3, timesOf3)) * (int) (Math.pow(2, timesOf2));// 返回它们的乘积
    }

    /**
     * 动态规划
     */
    public int integerBreak_DynamicProgramming(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            for (int j = 1; j < i; j++)
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[j] * (i - j)));
        return dp[n];
    }

    /* ==================test================== */
    public static void main(String[] args) {
        int ans1 = 0, ans2 = 0;
        int n = 10;
        N0016_CutTheRope test = new N0016_CutTheRope();

        ans2 = test.integerBreak_Greedy(n);
        ans1 = test.integerBreak_DynamicProgramming(n);

        System.out.println(ans1);
        System.out.println(ans2);
    }
}