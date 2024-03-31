package geollan.leetcode.lc334;

/**
 * @Description 比较大小 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/31 08:48
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        long[] f = new long[3];
        f[1] = f[2] = (int)1e19;

        for(int i = 0; i < n; i++) {
            int t = nums[i];
            if(f[2] < t) return true;
            else if(f[2] > t && f[1] < t) f[2] = t;
            else if(f[1] > t) {
                f[1] = t;
            }
        }

        return false;
    }
}
