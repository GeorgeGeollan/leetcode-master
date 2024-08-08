package geollan.leetcode.lc3131;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/8/8 9:04
 * @Author: Geollan
 **/
public class Solution02 {
    public int addedInteger(int[] nums1, int[] nums2) {
        return getMin(nums2) - getMin(nums1);
    }

    public int getMin(int[] arr) {
        int minVal = Integer.MAX_VALUE;

        for(int v: arr) {
            minVal = Math.min(minVal, v);
        }

        return minVal;
    }
}
