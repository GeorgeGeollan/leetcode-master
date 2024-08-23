package geollan.leetcode.lc3100_3199.lc3131;

import java.util.Arrays;

/**
 * @Description 时间复杂度O(nlogN) 空间复杂度O(1)
 * @Date: 2024/8/8 9:03
 * @Author: Geollan
 **/
public class Solution01 {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int x = nums2[0] - nums1[0];
        return x;
    }
}
