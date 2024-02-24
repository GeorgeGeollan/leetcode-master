package main.org.offer.geollan.jz71;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/24 21:19
 * @Author: Geollan
 **/
public class Solution01 {
    public int jumpFloorII(int number) {
        // write code here
        if (number <= 1)
            return number;
        int[] dp = new int[number + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= number; i++) {
            dp[i] = dp[i - 1] + dp[i - 1];
        }

        return dp[number];
    }
}
