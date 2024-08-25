package geollan.leetcode.lc3100_3199.lc3146;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/8/25 11:50
 * @Author: Geollan
 **/
public class Solution01 {
    class Solution {
        public int findPermutationDifference(String s, String t) {
            int n = s.length();
            int[] idx1 = new int[26];
            int[] idx2 = new int[26];
            int ans = 0;

            for(int i = 0; i < n; i++) {
                idx1[s.charAt(i) - 'a'] = i;
                idx2[t.charAt(i) - 'a'] = i;
            }

            for(int i = 0; i < 26; i++) {
                ans += Math.abs(idx1[i] - idx2[i]);
            }

            return ans;
        }
    }
}
