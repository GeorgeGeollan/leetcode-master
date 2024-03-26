package main.org.offer.geollan.jz66;

/**
 * @Description 迭代/双数组 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/3/11 10:27
 * @Author: Geollan
 **/
public class Solution02 {
    public int[] multiply(int[] A) {
        // write code here
        int n = A.length;
        int[] dp = new int[n];
        int[] dp2 = new int[n];
        dp[0] = 1;
        dp2[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = A[i - 1] * dp[i - 1];
        }

        // [1,1,2,6,24]

        for (int i = n - 2; i >= 0; i--) {
            dp2[i] = dp2[i + 1] * A[i + 1];
        }

        for (int i = 0; i < n; i++) {
            dp[i] = dp[i] * dp2[i];
        }

        return dp;
    }
}
