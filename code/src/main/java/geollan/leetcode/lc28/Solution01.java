package geollan.leetcode.lc28;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/8/19 9:07
 * @Author: Geollan
 **/
public class Solution01 {
    public int strStr(String haystack, String needle) {
        int firstIdx = -1;
        int n = haystack.length(), m = needle.length();

        for(int i = 0; i < haystack.length(); i++) {
            if(i + m > n) return firstIdx;

            if(haystack.charAt(i) == needle.charAt(0)) {
                if(haystack.substring(i, i + m).equals(needle)) return i;
            }
        }

        return -1;
    }
}
