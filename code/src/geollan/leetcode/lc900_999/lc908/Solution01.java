package geollan.leetcode.lc900_999.lc908;

import java.util.Arrays;

/**
 * @Description 时间复杂度O(NlogN) 空间复杂度O(1)
 * @Date: 2024/10/20 10:33
 * @Author: Geollan
 **/
public class Solution01 {
    public int smallestRangeI(int[] nums, int k) {
        if(nums.length == 1) return 0;
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length - 1];
        int c = b - a;

        if(b - a <= 2 * k) return 0;
        else return b - a - 2 * k;
    }
}
