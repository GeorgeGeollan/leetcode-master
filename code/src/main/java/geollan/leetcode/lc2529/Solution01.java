package geollan.leetcode.lc2529;

/**
 * @Description 统计个数法 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/9 9:20
 * @Author: Geollan
 **/
public class Solution01 {
    public int maximumCount(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        int positive = 0;

        for(int num: nums) {
            if(num > 0) {
                positive++;
                cnt++;
            }
            else if(num == 0) continue;
            else cnt--;
        }

        return cnt > 0 ? positive : positive + Math.abs(cnt);
    }
}
