package geollan.leetcode.lc3400_3500.lc3402;

/**
 * @Description
 * @Date: 2025/1/3 14:26
 * @Author: Geollan
 **/
public class Solution01 {
    public int minimumOperations(int[][] grid) {
        int ans = 0;

        for(int i = 0; i < grid.length - 1; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i + 1][j] <= grid[i][j]) {
                    System.out.println(grid[i][j] + 1 - grid[i + 1][j]);
                    ans += grid[i][j] + 1 - grid[i + 1][j];
                    grid[i + 1][j] = grid[i][j] + 1;
                }
            }
        }

        return ans;
    }
}
