package geollan.leetcode.lc3200_3299.lc3222;

/**
 * @Description 时间复杂度O(logN) 空间复杂度O(1)
 * @Date: 2024/7/26 9:31
 * @Author: Geollan
 **/
public class Solution01 {
    public String losingPlayer(int x, int y) {
        int cnt = 0;

        while(x >= 0 && y >= 0) {
            x -= 1;
            y -= 4;
            cnt++;
        }

        return cnt % 2 == 0 ? "Alice" : "Bob";
    }
}
