package geollan.leetcode.lc3201;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/7/10 10:36
 * @Author: Geollan
 **/
public class Solution01 {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int odd = 0, even = 0, t = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] % 2 == 0) even++;
            else odd++;
            if(nums[i] % 2 != nums[i + 1] % 2) t++;
        }

        if(nums[n - 1] % 2 == 0) even++;
        else odd++;

        return Math.max(Math.max(even, odd), t + 1);
    }
}
