package geollan.leetcode.lc2800_2899.lc2810;

/**
 * @Description StringBuilder 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/4/1 09:06
 * @Author: Geollan
 **/
public class Solution01 {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'i') sb.reverse();

            else sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
