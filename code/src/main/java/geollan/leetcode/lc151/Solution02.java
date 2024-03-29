package geollan.leetcode.lc151;

/**
 * @Description 双指针 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/3/29 11:15
 * @Author: Geollan
 **/
public class Solution02 {
    public String reverseWords(String s) {
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuilder sb = new StringBuilder();

        while(i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') i--;
            sb.append(s.substring(i + 1, j + 1) + " ");
            while (i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }

        return sb.toString().trim();
    }
}
