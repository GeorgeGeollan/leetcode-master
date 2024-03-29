package geollan.newcoder.jz49;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/3/17 15:49
 * @Author: Geollan
 **/
public class Solution01 {
    public int GetUglyNumber_Solution(int index) {
        // write code here
        if (index == 0)
            return 0;
        int[] dp = new int[index];
        dp[0] = 1;
        int a = 0, b = 0, c = 0;

        for (int i = 1; i < index; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(n2, Math.min(n3, n5));
            if (dp[i] == n2)
                a++;
            if (dp[i] == n3)
                b++;
            if (dp[i] == n5)
                c++;
        }

        return dp[index - 1];
    }
}
