package geollan.leetcode.lc1700_1799.lc1768;

/**
 * @Description 迭代/String 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/24 11:17
 * @Author: Geollan
 **/
public class Solution01 {
    public String mergeAlternately(String word1, String word2) {
        String concatStr = "";
        int m = word1.length(), n = word2.length();
        int i = 0, j = 0;
        while(i < m && j < n) {
            concatStr += word1.charAt(i++);
            concatStr += word2.charAt(j++);
        }

        while(i < m) {
            concatStr += word1.charAt(i++);
        }

        while(j < n) {
            concatStr += word2.charAt(j++);
        }

        return concatStr;
    }
}
