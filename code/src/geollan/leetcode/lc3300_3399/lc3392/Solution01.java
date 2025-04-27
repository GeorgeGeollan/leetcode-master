package src.geollan.leetcode.lc3300_3399.lc3392;

/**
 * @Description
 * @Date: 2025/4/27 8:42
 * @Author: Geollan
 **/
public class Solution01 {
    public int countSubarrays(int[] nums) {
        int cnt = 0;

        for(int i = 0; i < nums.length - 2; i++) {
            if((nums[i] + nums[i + 2]) * 2 == nums[i + 1]) {
                cnt++;
            }
        }

        return cnt;
    }
}
