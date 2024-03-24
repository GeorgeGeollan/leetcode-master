package geollan.leetcode.lc1768;

/**
 * @Description 迭代/StringBuilder 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/24 11:32
 * @Author: Geollan
 **/
public class Solution03 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int m = word1.length(), n = word2.length(), i = 0, j = 0;
        while(i < m || j < n) {
            if(i < m) sb.append(word1.charAt(i++));
            if(j < n) sb.append(word2.charAt(j++));
        }

        return sb.toString();
    }
}
