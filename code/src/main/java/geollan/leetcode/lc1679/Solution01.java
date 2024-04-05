package geollan.leetcode.lc1679;

import java.util.Arrays;

/**
 * @Description 双指针 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/5 11:27
 * @Author: Geollan
 **/
public class Solution01 {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0, right = nums.length - 1;
        int cnt = 0;

        while(left < right) {
            if(nums[left] + nums[right] == k) {
                cnt++;
                left++;
                right--;
            }

            else if(nums[left] + nums[right] > k) {
                right--;
            }

            else if(nums[left] + nums[right] < k) {
                left++;
            }
        }

        return cnt;
    }
}
