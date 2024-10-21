package geollan.leetcode.lc900_999.lc910;

import java.util.Arrays;

/**
 * @Description 时间复杂度O(NlogN) 空间复杂度O(1)
 * @Date: 2024/10/21 14:20
 * @Author: Geollan
 **/
public class Solution01 {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[n - 1] - nums[0];

        for(int i = 1; i < n; i++) {
            int mx = Math.max(nums[i - 1] + k , nums[n - 1] - k);
            int mn = Math.min(nums[0] + k , nums[i] - k);
            ans = Math.min(ans, mx - mn);
        }

        return ans;
    }
}
