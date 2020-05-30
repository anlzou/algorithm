/**
 * @Date        : 2020-05-30 14:44:42
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-30 14:53:35
 * @FilePath    : \algorithm\code\N0012_JumpFloorPlus.java
 * @Describe    : 
 */
package code;

import java.util.Arrays;

public class N0012_JumpFloorPlus {
    /**
     * 动态规划
     */
    public int JumpFloorPlus(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        for (int i = 1; i < target; i++)
            for (int j = 0; j < i; j++)
                dp[i] += dp[j];
        return dp[target - 1];
    }

    /**
     * 数学推导
     */
    public int JumpFloorPlus2(int target) {
        return (int) Math.pow(2, target - 1);
    }

    public static void main(String[] args) {
        N0012_JumpFloorPlus test = new N0012_JumpFloorPlus();
        System.out.println(test.JumpFloorPlus(8));

        System.out.println(test.JumpFloorPlus2(8));
    }
}