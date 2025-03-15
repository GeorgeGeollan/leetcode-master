package src.geollan.leetcode.lc3100_3199.lc3110;

/**
 * @Description
 * @Date: 2025/3/15 9:30
 * @Author: Geollan
 **/
public class Solution01 {
    public int scoreOfString(String s) {
        int score = 0;

        for(int i = 0; i < s.length() - 1; i++) {
            score += (Math.abs(s.charAt(i) -s.charAt(i + 1)));
        }

        return score;

    }
}
