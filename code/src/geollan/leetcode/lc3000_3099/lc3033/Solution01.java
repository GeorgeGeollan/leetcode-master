package geollan.leetcode.lc3000_3099.lc3033;

/**
 * @Description 额外数组 简单遍历 时间复杂度O(MN) 空间复杂度O(N)
 * @Date: 2024/7/5 8:54
 * @Author: Geollan
 **/
public class Solution01 {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[] maxRow = new int[matrix.length];

        for(int i = 0; i < matrix[0].length; i++) {
            int max = -1;
            for(int j = 0; j < matrix.length; j++) {
                if(max < matrix[j][i]) max = matrix[j][i];
            }

            for(int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] == -1) matrix[j][i] = max;
            }
        }

        return matrix;
    }
}
