package geollan.leetcode.lc2700_2799.lc2708;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/9/3 9:27
 * @Author: Geollan
 **/
public class Solution02 {
    public long maxStrength(int[] nums) {
        long mn = nums[0];
        long mx = mn;

        for(int i = 1; i < nums.length; i++) {
            long x = nums[i];
            long tmp = mn;
            mn = Math.min(Math.min(mn, x), Math.min(mn * x, mx * x));
            mx = Math.max(Math.max(mx, x), Math.max(tmp * x, mx * x));
        }

        return mx;
    }
}
