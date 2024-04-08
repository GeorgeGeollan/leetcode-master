package geollan.leetcode.lc1004;

/**
 * @Description 双指针（超级妙，在于1 - nums[right]） 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/8 08:49
 * @Author: Geollan
 **/
public class Solution01 {
    public int longestOnes(int[] nums, int k) {
        int ans = 0, left = 0, cnt0 = 0, n = nums.length;

        for(int right = 0; right < n; right++) {
            cnt0 += 1 - nums[right];
            while(cnt0 > k) {
                cnt0 -= 1 - nums[left++];
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
