package geollan.leetcode.lc200_299.lc283;

/**
 * @Description 原地算法 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/2 09:04
 * @Author: Geollan
 **/
public class Solution01 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int ptr = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                nums[ptr++] = nums[i];
            }
        }

        for(int i = ptr; i < n; i++) {
            nums[i] = 0;
        }
    }
}
