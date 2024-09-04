package geollan.leetcode.lc3100_3199.lc3158;

/**
 * @Description 一次遍历 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/6/19 10:05
 * @Author: Geollan
 **/
public class Solution02 {
    public int duplicateNumbersXOR(int[] nums) {
        int ans = 0;
        long vis = 0;
        for(int num: nums) {
            if((vis >> num & 1) > 0) ans ^= num;
            else vis |= 1L << num;
        }

        return ans;
    }
}
