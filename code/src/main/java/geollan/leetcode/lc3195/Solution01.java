package geollan.leetcode.lc3195;

/**
 * @Description 边界问题 时间复杂度O(MN) 空间复杂度O(1)
 * @Date: 2024/6/28 9:31
 * @Author: Geollan
 **/
public class Solution01 {
    public int minimumArea(int[][] grid) {
        int left = grid[0].length;
        int right = 0;
        int up = grid.length;
        int bottom = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    left = Math.min(left, j);
                    right = Math.max(right, j);
                    up = Math.min(up, i);
                    bottom = i;
                }
            }
        }

        return (right - left + 1) * (bottom - up + 1);
    }
}
