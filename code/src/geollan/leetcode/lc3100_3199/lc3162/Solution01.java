package geollan.leetcode.lc3100_3199.lc3162;

/**
 * @Description 时间复杂度O(MN) 空间复杂度O(1)
 * @Date: 2024/10/10 9:02
 * @Author: Geollan
 **/
public class Solution01 {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        // 直接遍历nums2
        int cnt = 0;

        for(int num2: nums2) {
            for(int num1: nums1) {
                if(num1 % (num2 * k) == 0) cnt++;
            }
        }

        return cnt;
    }
}
