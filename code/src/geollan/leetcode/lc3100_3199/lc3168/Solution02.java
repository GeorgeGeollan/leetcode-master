package geollan.leetcode.lc3100_3199.lc3168;

/**
 * @Description 单独变量 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/6/7 10:00
 * @Author: Geollan
 **/
public class Solution02 {
    public int minimumChairs(String s) {
        int ans = 0;
        int cnt = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'E') ans = Math.max(ans, ++cnt);

            else cnt--;
        }

        return ans;
    }
}
