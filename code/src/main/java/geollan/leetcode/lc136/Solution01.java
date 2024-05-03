package geollan.leetcode.lc136;

/**
 * @Description 异或操作 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/5/3 21:08
 * @Author: Geollan
 **/
public class Solution01 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num: nums) {
            ans ^= num;
        }

        return ans;
    }
}
