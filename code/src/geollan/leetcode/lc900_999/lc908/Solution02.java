package geollan.leetcode.lc900_999.lc908;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/10/20 10:35
 * @Author: Geollan
 **/
public class Solution02 {
    public int smallestRangeI(int[] nums, int k) {
        int mn = nums[0];
        int mx = nums[0];

        for(int num: nums) {
            mn = Math.min(mn, num);
            mx = Math.max(mx, num);
        }

        return Math.max(mx - mn - 2 * k, 0);
    }
}
