package geollan.newcoder.jz66;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/3/11 10:04
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] multiply(int[] A) {
        // write code here
        int n = A.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int temp = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = A[i - 1] * dp[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            temp *= A[i + 1];
            dp[i] *= temp;
        }

        return dp;
    }
}
