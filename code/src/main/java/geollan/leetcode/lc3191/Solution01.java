package geollan.leetcode.lc3191;

/**
 * @Description
 * @Date: 2024/6/25 9:27
 * @Author: Geollan
 **/
public class Solution01 {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for(int i = 0; i < n - 2; i++) {
            if(nums[i] == 0) {
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                ans++;
            }
        }

        return nums[n - 1] == 1 && nums[n - 2] == 1 ? ans : -1;
    }
}
