package geollan.leetcode.lc5;

/**
 * @Description 中心扩散法 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/5/27 9:10
 * @Author: Geollan
 **/
public class Solution01 {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLength = 0;
        int maxStart = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= 1; j++) {
                int l = i;
                int r = i + j;

                while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                }

                l++;
                r--;

                if(maxLength < r - l + 1) {
                    maxLength = r - l + 1;
                    maxStart = l;
                }
            }
        }

        return s.substring(maxStart, maxLength + maxStart);
    }
}
