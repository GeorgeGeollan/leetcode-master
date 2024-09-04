package geollan.leetcode.lc3200_3299.lc3242;

/**
 * @Description 时间复杂度O(MN) 空间复杂度O(1)
 * @Date: 2024/8/5 8:59
 * @Author: Geollan
 **/
public class Solution01 {
    class neighborSum {
        int[][] grid;

        public neighborSum(int[][] grid) {
            this.grid = grid;
        }

        public int adjacentSum(int value) {
            int adjSum = 0;

            for(int i = 0; i < grid.length; i++) {
                for(int j = 0; j < grid[0].length; j++) {
                    if(grid[i][j] == value) {
                        if(i - 1 >= 0) adjSum += grid[i - 1][j];
                        if(j - 1 >= 0) adjSum += grid[i][j - 1];
                        if(i + 1 < grid.length) adjSum += grid[i + 1][j];
                        if(j + 1 < grid.length) adjSum += grid[i][j + 1];
                        return adjSum;
                    }
                }
            }

            return -1;
        }

        public int diagonalSum(int value) {
            int diaSum = 0;
            for(int i = 0; i < grid.length; i++) {
                for(int j = 0; j < grid[0].length; j++) {
                    if(grid[i][j] == value) {
                        if(i - 1 >= 0 && j - 1 >= 0) diaSum += grid[i - 1][j - 1];
                        if(j - 1 >= 0 && i + 1 < grid.length) diaSum += grid[i + 1][j - 1];
                        if(j + 1 < grid.length && i - 1 >= 0) diaSum += grid[i - 1][j + 1];
                        if(j + 1 < grid.length && i + 1 < grid.length) diaSum += grid[i + 1][j + 1];
                        return diaSum;
                    }
                }
            }
            return -1;
        }
    }
}
