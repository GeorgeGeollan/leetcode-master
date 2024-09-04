package geollan.leetcode.lc3100_3199.lc3169;

import java.util.Arrays;

/**
 * @Description 时间复杂度O(logN) 空间复杂度O(1)
 * @Date: 2024/6/10 12:28
 * @Author: Geollan
 **/
public class Solution01 {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (p, q) -> (p[0] - q[0]));
        int start = 1, end = 0;

        for(int[] p: meetings) {
            if(p[0] > end) {
                days -= end - start + 1;
                start = p[0];
            }

            end = Math.max(end, p[1]);
        }

        days -= end - start + 1;
        return days;
    }
}
