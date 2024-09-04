package geollan.leetcode.lc200_299.lc283;

/**
 * @Description 双指针 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/2 09:11
 * @Author: Geollan
 **/
public class Solution02 {
    public void moveZeroes(int[] nums) {
        int n = nums.length, right = 0, left = 0;

        while(right < n) {
            if(nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }

            right++;
        }
    }
}
