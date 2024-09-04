package geollan.leetcode.lc1400_1499.lc1493;

/**
 * @Description
 * @Date: 2024/4/10 9:13
 * @Author: Geollan
 **/
public class Solution01 {
    public int longestSubarray(int[] nums) {
        boolean hasZero = false;
        int cnt = 0, maxCnt = 0, zeroIdx = 0;

        for(int left = 0, right = 0; right < nums.length; right++) {
            if(nums[right] == 1) {
                cnt++;
            }

            else if(nums[right] == 0 && !hasZero) {
                zeroIdx = right;
                hasZero = true;
            }

            else {
                cnt = cnt - (zeroIdx - left);
                left = zeroIdx + 1;
                zeroIdx = right;
            }

            maxCnt = Math.max(maxCnt, cnt);
        }

        return !hasZero? maxCnt - 1 : maxCnt;
    }
}
