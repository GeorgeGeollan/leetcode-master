package geollan.leetcode.lc200_299.lc238;

/**
 * @Description 单数组 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/30 15:26
 * @Author: Geollan
 **/
public class Solution02 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if(n == 0) return new int[0];

        int[] ans = new int[n];
        ans[0] = 1;

        for(int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int temp = 1;
        for(int i = n - 2; i >= 0; i--) {
            temp *= nums[i + 1];
            ans[i] *= temp;
        }

        return ans;
    }
}
