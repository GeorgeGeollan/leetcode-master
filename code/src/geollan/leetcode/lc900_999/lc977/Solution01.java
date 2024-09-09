package geollan.leetcode.lc900_999.lc977;

import java.util.Arrays;

/**
 * @Description 时间复杂度O(logN) 空间复杂度O(1)
 * @Date: 2024/9/8 22:00
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = nums[i] * nums[i];
        }

        Arrays.sort(ans);
        return ans;
    }
}
