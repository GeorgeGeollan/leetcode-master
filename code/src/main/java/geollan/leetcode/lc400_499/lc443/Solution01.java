package geollan.leetcode.lc400_499.lc443;

/**
 * @Description StringBuilder 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/4/1 09:12
 * @Author: Geollan
 **/
public class Solution01 {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        char prev = chars[0];
        int cnt = 1;

        for(int i = 1; i < chars.length; i++) {
            char cur = chars[i];

            if(prev == cur) cnt++;
            else {
                sb.append(prev);
                if(cnt != 1) sb.append(cnt);

                prev = cur;
                cnt = 1;
            }
        }

        sb.append(prev);
        if(cnt != 1) sb.append(cnt);

        for(int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}
