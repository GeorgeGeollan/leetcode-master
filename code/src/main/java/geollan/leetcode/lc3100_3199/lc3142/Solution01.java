package geollan.leetcode.lc3100_3199.lc3142;

/**
 * @Description 时间复杂度O(MN) 空间复杂度O(1)
 * @Date: 2024/8/29 10:41
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean satisfiesConditions(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 1; j < grid[0].length; j++) {
                if(grid[i][j - 1] == grid[i][j]) return false;
            }
        }

        for(int j = 0; j < grid[0].length; j++) {
            for(int i = 1; i < grid.length; i++) {
                if(grid[i - 1][j] != grid[i][j]) return false;
            }
        }

        return true;
    }
}
