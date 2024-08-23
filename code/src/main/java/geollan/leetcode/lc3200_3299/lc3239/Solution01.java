package geollan.leetcode.lc3200_3299.lc3239;

/**
 * @Description 时间复杂度O(MN) 空间复杂度O(1)
 * @Date: 2024/8/7 8:50
 * @Author: Geollan
 **/
public class Solution01 {
    public int minFlips(int[][] grid) {
        int minRows = 0, minCols = 0;
        int m = grid.length, n = grid[0].length;

        for(int j = 0; j < n; j++) {
            for(int i = 0; i < m / 2; i++) {
                if(grid[i][j] != grid[m - i - 1][j]) minRows++;
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n / 2; j++) {
                if(grid[i][j] != grid[i][n - j - 1]) minCols++;
            }
        }

        return Math.min(minRows, minCols);
    }
}
