package geollan.leetcode.lc3192;

/**
 * @Description
 * @Date: 2024/6/26 9:17
 * @Author: Geollan
 **/
public class Solution01 {
    public int minOperations(int[] nums) {
        int ans = 0;

        for(int num: nums) {
            if(num == ans % 2) {
                ans++;
            }
        }

        return ans;
    }
}
