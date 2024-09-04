package geollan.leetcode.lc700_799.lc746;

/**
 * @Description 一维数组 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/5/2 21:37
 * @Author: Geollan
 **/
public class Solution01 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        return Math.min(dp[n-1], dp[n - 2]);
    }
}
