package geollan.leetcode.lc3200_3299.lc3254;

import java.util.Arrays;

/**
 * @Description 时间复杂度O(n) 空间复杂度O(1)
 * @Date: 2024/8/22 10:05
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Arrays.fill(ans, -1);
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            cnt = i == 0 || nums[i - 1] + 1 == nums[i]? cnt + 1 : 1;
            if(cnt >= k) ans[i - k + 1] = nums[i];
        }

        return ans;
    }
}
