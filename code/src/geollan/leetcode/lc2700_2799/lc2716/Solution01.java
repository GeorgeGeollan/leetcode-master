package src.geollan.leetcode.lc2700_2799.lc2716;

/**
 * @Description
 * @Date: 2025/3/28 9:15
 * @Author: Geollan
 **/
public class Solution01 {
    public int minimizedStringLength(String s) {
        int[] cnt = new int[26];
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(cnt[i] > 0) ans++;
        }

        return ans;
    }
}
