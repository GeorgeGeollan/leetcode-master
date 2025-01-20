package geollan.leetcode.lc2200_2299.lc2239;

/**
 * @Description 时间复杂度O(N)
 * @Date: 2025/1/20 9:47
 * @Author: Geollan
 **/
public class Solution01 {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int num: nums) {
            int cur = Math.abs(num - 0);

            if(cur == 0) return cur;
            if(cur < min) {
                min = cur;
                ans = num;
            }
            else if(cur == min) ans = Math.max(ans, num);
        }

        return ans;
    }
}
