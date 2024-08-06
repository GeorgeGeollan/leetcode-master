package geollan.leetcode.lc3238;

/**
 * @Description 时间复杂度O(nU+m)，其中 m 是 pick 的长度，U 是 yi 的最大值     空间复杂度O(nU)
 * @Date: 2024/8/6 9:31
 * @Author: Geollan
 **/
public class Solution01 {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] cnt = new int[n][11];
        int ans = 0;

        for(int[] p: pick) {
            cnt[p[0]][p[1]]++;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 11; j++) {
                if(cnt[i][j] > i) {
                    ans++;
                    break;
                }
            }
        }

        return ans;
    }
}
