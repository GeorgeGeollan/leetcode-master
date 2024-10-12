package geollan.leetcode.lc3300_3400.lc3309;

import java.util.Arrays;

/**
 * @Description 时间复杂度O(logN) 空间复杂度O(1)
 * @Date: 2024/10/12 10:14
 * @Author: Geollan
 **/
public class Solution01 {
    public int maxGoodNumber(int[] nums) {
        Integer[] arr = new Integer[]{nums[0], nums[1], nums[2]};

        Arrays.sort(arr, (a, b) -> {
            int lenA = 32 - Integer.numberOfLeadingZeros(a);
            int lenB = 32 - Integer.numberOfLeadingZeros(b);
            return (b << lenA | a) - (a << lenB | b);
        });

        int ans = 0;

        for(int x: arr) {
            int lenX = 32 - Integer.numberOfLeadingZeros(x);
            ans = ans << lenX | x;
        }

        return ans;
    }
}
