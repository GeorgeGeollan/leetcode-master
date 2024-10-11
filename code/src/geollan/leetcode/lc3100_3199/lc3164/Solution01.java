package geollan.leetcode.lc3100_3199.lc3164;

import java.util.HashMap;

/**
 * @Description
 * @Date: 2024/10/11 10:02
 * @Author: Geollan
 **/
public class Solution01 {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        HashMap<Integer, Integer> cnt = new HashMap<>();

        for(int x: nums1) {
            if(x % k != 0) continue;

            x /= k;

            for(int d = 1; d * d <= x; d++) {
                if(x % d != 0) continue;
                cnt.merge(d, 1, Integer::sum);
                if(d * d < x) cnt.merge(x / d, 1, Integer::sum);
            }
        }

        long ans = 0;
        for(int a: nums2) {
            ans += cnt.getOrDefault(a, 0);
        }

        return ans;
    }
}
