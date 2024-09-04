package geollan.leetcode.lc3200_3299.lc3228;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/8/3 10:58
 * @Author: Geollan
 **/
public class Solution01 {
    public int maxOperations(String s) {
        char[] ch = s.toCharArray();
        int ans = 0;
        int cnt = 0;

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == '1') cnt++;
            else if(i > 0 && ch[i - 1] == '1') {
                ans += cnt;
            }
        }

        return ans;
    }
}
