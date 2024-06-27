package geollan.leetcode.lc3194;

import java.util.Arrays;

/**
 * @Description 双指针 时间复杂度O(NlogN) 空间复杂度O(N)
 * @Date: 2024/6/27 9:18
 * @Author: Geollan
 **/
public class Solution01 {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double minVal = 50;

        int l = 0, r = nums.length - 1;

        while(l < r) {
            double avg = (nums[l++] * 1.0 + nums[r--]) / 2;
            minVal = Math.min(minVal, avg);
        }

        return minVal;
    }
}
