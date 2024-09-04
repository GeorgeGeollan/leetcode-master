package geollan.leetcode.lc2300_2399.lc2390;

/**
 * @Description 优化：只是用StringBuilder
 * @Date: 2024/4/16 9:10
 * @Author: Geollan
 **/
public class Solution02 {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') sb.deleteCharAt(sb.length() - 1);
            else sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
