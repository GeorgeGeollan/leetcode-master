package geollan.leetcode.lc3200_3299.lc3222;

/**
 * @Description 时间复杂度O(1) 空间复杂度O(1)
 * @Date: 2024/7/26 9:35
 * @Author: Geollan
 **/
public class Solution02 {
    public String losingPlayer(int x, int y) {
        return Math.min(x, y / 4) % 2 == 1 ? "Alice" : "Bob";
    }
}
