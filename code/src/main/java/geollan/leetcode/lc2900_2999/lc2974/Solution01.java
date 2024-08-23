package geollan.leetcode.lc2900_2999.lc2974;

import java.util.Arrays;

/**
 * @Description 时间复杂度O(NlogN) 空间复杂度O(1)
 * @Date: 2024/7/12 9:28
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length -1; i += 2) {
            ans[i] = nums[i + 1];
            ans[i + 1] = nums[i];
        }

        return ans;
    }
}
