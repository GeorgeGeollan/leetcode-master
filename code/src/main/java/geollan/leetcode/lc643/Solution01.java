package geollan.leetcode.lc643;

/**
 * @Description 双指针/固定范围 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/6 15:29
 * @Author: Geollan
 **/
public class Solution01 {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0, right = 0, sum = 0;
        int n = nums.length;
        double avg = -10000;
        System.out.println(avg);

        while(right < n) {
            if(right - left < k) {
                sum += nums[right++];
            }

            if(right - left == k) {
                avg = Math.max(avg, sum * 1.0 / k);
                sum -= nums[left++];
            }
        }

        return avg;
    }
}
