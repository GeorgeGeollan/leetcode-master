package geollan.leetcode.lc900_999.lc997;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/9/22 14:12
 * @Author: Geollan
 **/
public class Solution01 {
    public int findJudge(int n, int[][] trust) {
        int[] cnt = new int[n];
        int ans = -1;

        for(int i = 0; i < trust.length; i++) {
            cnt[trust[i][1] - 1]++;
        }

        for(int i = 0; i < n; i++) {
            if(cnt[i] == n - 1) {
                ans = i + 1;
            }
        }

        if(ans == -1) return -1;

        for(int i = 0; i < trust.length; i++) {
            if(trust[i][0] == ans) return -1;
        }

        return ans;
    }
}
