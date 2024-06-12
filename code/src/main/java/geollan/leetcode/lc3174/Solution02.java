package geollan.leetcode.lc3174;

/**
 * @Description StringBuilder 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/6/12 10:32
 * @Author: Geollan
 **/
public class Solution02 {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();

        for(char ch: chars) {
            if(Character.isDigit(ch)) sb.deleteCharAt(sb.length() - 1);
            else sb.append(ch);
        }

        return sb.toString();
    }
}
