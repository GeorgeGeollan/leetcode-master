package src.geollan.leetcode.lc1900_2000.lc1920;

/**
 * @Description
 * @Date: 2025/5/6 8:24
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
