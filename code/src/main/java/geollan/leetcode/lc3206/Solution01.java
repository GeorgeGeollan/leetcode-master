package geollan.leetcode.lc3206;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/7/14 11:42
 * @Author: Geollan
 **/
public class Solution01 {
    public int numberOfAlternatingGroups(int[] colors) {
        int cnt = 0;
        int n = colors.length;

        for(int i = 0; i < colors.length - 2; i++) {
            if(colors[i] != colors[i + 1] && colors[i + 1] != colors[i + 2]) cnt++;
        }

        if(colors[0] != colors[n - 1]) {
            if(colors[0] != colors[1]) cnt++;
            if(colors[n - 2] != colors[n - 1]) cnt++;
        }

        return cnt;
    }
}
