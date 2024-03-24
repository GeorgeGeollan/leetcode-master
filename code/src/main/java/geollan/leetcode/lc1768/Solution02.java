package geollan.leetcode.lc1768;

/**
 * @Description 迭代/内置方法 时间复杂度O(n) 空间复杂度O(1)
 * @Date: 2024/3/24 11:26
 * @Author: Geollan
 **/
public class Solution02 {
    public String mergeAlternately(String word1, String word2) {
        String concatStr = "";
        int m = word1.length(), n = word2.length();
        int i = 0, j = 0;
        while(i < m && j < n) {
            concatStr += word1.charAt(i++);
            concatStr += word2.charAt(j++);
        }

        if(m > n) concatStr += word1.substring(i, m);
        if(m < n) concatStr += word2.substring(j, n);

        return concatStr;
    }
}
