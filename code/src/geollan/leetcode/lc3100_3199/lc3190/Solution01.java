package geollan.leetcode.lc3100_3199.lc3190;

/**
 * @Description
 * @Date: 2024/6/24 9:06
 * @Author: Geollan
 **/
public class Solution01 {
    public int minimumOperations(int[] nums) {
        int ops = 0;

        for(int num: nums) {
            ops += Math.min(num % 3, 3 - num % 3);
        }

        return ops;
    }
}
