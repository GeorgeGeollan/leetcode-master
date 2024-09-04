package geollan.leetcode.lc3200_3299.lc3200;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/7/8 11:07
 * @Author: Geollan
 **/
public class Solution01 {
    public int maxHeightOfTriangle(int red, int blue) {
        int[] cnt = new int[2];
        for(int i = 1; ; i++) {
            cnt[i % 2] += i;

            if((cnt[0] > red || cnt[1] > blue) && (cnt[0] > blue || cnt[1] > red)) return i - 1;
        }
    }
}
