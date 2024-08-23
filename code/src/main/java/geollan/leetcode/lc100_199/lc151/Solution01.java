package geollan.leetcode.lc100_199.lc151;

/**
 * @Description 字符串分割 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/3/29 10:57
 * @Author: Geollan
 **/
public class Solution01 {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            if(words[i] == null || words[i].length() == 0) continue;
            sb.append(words[i]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
