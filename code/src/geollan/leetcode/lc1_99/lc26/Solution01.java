package geollan.leetcode.lc1_99.lc26;

/**
 * @Description 丑陋双指针 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/7/19 9:17
 * @Author: Geollan
 **/
public class Solution01 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int prev = nums[0];
        for(int i = 1; i < n; i++) {
            while(i < n && nums[i] == nums[i - 1]) {
                i++;
            }

            if(i >= n) break;

            nums[left + 1] = nums[i];
            left++;
        }

        return left+1;
    }
}
