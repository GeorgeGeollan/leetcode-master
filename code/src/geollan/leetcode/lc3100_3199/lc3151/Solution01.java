package geollan.leetcode.lc3100_3199.lc3151;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/8/13 9:31
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) return true;
        int prev = nums[0] % 2;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] % 2 == prev) return false;
            prev = nums[i] % 2;
        }

        return true;
    }
}
