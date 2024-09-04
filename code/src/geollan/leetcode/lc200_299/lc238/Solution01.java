package geollan.leetcode.lc200_299.lc238;

import java.util.Arrays;

/**
 * @Description 双数组 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/30 11:56
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        for(int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        for(int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for(int i = 0; i < n; i++) {
            left[i] = left[i] * right[i];
        }

        return left;
    }
}
