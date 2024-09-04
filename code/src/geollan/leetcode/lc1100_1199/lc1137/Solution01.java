package geollan.leetcode.lc1100_1199.lc1137;

/**
 * @Description 额外数组 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/5/1 22:03
 * @Author: Geollan
 **/
public class Solution01 {
    public int tribonacci(int n) {
        if(n <= 1) return n;
        if(n == 2) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for(int i = 3; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];

        return dp[n];
    }
}
