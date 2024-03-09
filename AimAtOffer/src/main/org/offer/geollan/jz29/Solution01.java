package main.org.offer.geollan.jz29;

import java.util.ArrayList;

/**
 * @Description 时间复杂度O(MN) 空间复杂度O(N)
 * @Date: 2024/3/9 16:47
 * @Author: Geollan
 **/
public class Solution01 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        int left = 0, right = matrix[0].length - 1;
        int up = 0, down = matrix.length - 1;
        ArrayList<Integer> ans = new ArrayList<>();

        while (left <= right && up <= down) {
            for (int i = left; i <= right; i++)
                ans.add(matrix[up][i]);
            if (++up > down)
                break;

            for (int i = up; i <= down; i++)
                ans.add(matrix[i][right]);
            if (left > --right)
                break;

            for (int i = right; i >= left; i--)
                ans.add(matrix[down][i]);
            if (up > --down)
                break;

            for (int i = down; i >= up; i--)
                ans.add(matrix[i][left]);
            if (++left > right)
                break;
        }

        return ans;
    }
}
