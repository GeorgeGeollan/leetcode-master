package geollan.leetcode.lc1732;

/**
 * @Description 简单模拟 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/9 11:18
 * @Author: Geollan
 **/
public class Solution01 {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int start = 0;

        for(int i = 0; i < gain.length; i++) {
            start = start + gain[i];
            max = Math.max(start, max);
        }

        return max;
    }
}
