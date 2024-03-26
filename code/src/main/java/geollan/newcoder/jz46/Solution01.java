package geollan.newcoder.jz46;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/29 19:43
 * @Author: Geollan
 **/
public class Solution01 {
    public int solve(String nums) {
        // write code here
        int len = nums.length();
        if (len == 0 || nums.charAt(0) == '0')
            return 0;
        int[] dp = new int[len + 1];
        dp[0] = 1;

        for (int i = 1; i <= len; i++) {
            char c = nums.charAt(i - 1);
            if (c != '0')
                dp[i] = dp[i - 1];
            if (i >= 2) {
                int val = Integer.valueOf(nums.substring(i - 2, i));
                if (val >= 10 && val <= 26)
                    dp[i] += dp[i - 2];
            }
        }

        return dp[len];
    }
}
