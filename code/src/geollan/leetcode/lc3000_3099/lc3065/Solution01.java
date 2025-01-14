package geollan.leetcode.lc3000_3099.lc3065;

/**
 * @Description 直接遍历 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2025/1/14 9:28
 * @Author: Geollan
 **/
public class Solution01 {
    public int minOperations(int[] nums, int k) {
        int cnt = 0;
        for(int num: nums) {
            if(num < k) cnt++;
        }

        return cnt;
    }
}
