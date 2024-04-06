package geollan.leetcode.lc643;

/**
 * @Description 简单高效版 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/6 15:38
 * @Author: Geollan
 **/
public class Solution02 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for(int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        return 1.0 * maxSum / k;
    }
}
