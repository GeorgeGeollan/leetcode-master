package geollan.leetcode.lc3200_3299.lc3274;

/**
 * @Description 时间复杂度O(1) 空间复杂度O(1)
 * @Date: 2024/9/2 14:18
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int c1 = (coordinate1.charAt(0) - 'a') + (coordinate1.charAt(1) - '1');
        int c2 = (coordinate2.charAt(0) - 'a') + (coordinate2.charAt(1) - '1');

        return c1 % 2 == c2 % 2;
    }
}
