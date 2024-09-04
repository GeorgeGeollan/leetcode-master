package geollan.leetcode.lc2700_2799.lc2708;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/9/3 9:20
 * @Author: Geollan
 **/
public class Solution01 {
    public long maxStrength(int[] nums) {
        if(nums.length == 1) return nums[0];
        long ans = 1;
        int cnt = 0;
        long neg = Long.MIN_VALUE;
        boolean hasZero = false;
        for(int num: nums) {
            if(num == 0) {
                hasZero = true;
                cnt++;
                continue;
            }
            ans *= num;
            if(num < 0) neg = Math.max(neg, num);
        }

        long temp = ans / neg;
        if(ans < 0 && hasZero && cnt + 1 == nums.length) return 0;
        if(cnt == nums.length) return 0;


        return ans > 0 ? ans: ans / neg;
    }
}
