package geollan.leetcode.lc2400_2499.lc2414;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/9/19 11:29
 * @Author: Geollan
 **/
public class Solution01 {
    public int longestContinuousSubstring(String s) {
        char[] ch = s.toCharArray();

        int cnt = 1;
        int max = 1;

        for(int i = 1; i < ch.length; i++) {
            if(ch[i - 1] + 1 == ch[i]) {
                cnt++;
                max = Math.max(cnt, max);
            }

            else cnt = 1;
        }

        return max;
    }
}
