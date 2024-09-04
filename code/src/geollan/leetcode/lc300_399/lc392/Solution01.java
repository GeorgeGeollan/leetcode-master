package geollan.leetcode.lc300_399.lc392;

/**
 * @Description 双指针 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/4/3 11:10
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean isSubsequence(String s, String t) {
        int m = s.length(), n = t.length();
        int i = 0, j = 0;

        while(i < m && j < n) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }

            else j++;
        }

        return i == m;
    }
}
