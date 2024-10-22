package geollan.leetcode.lc3100_3199.lc3184;

/**
 * @Description 时间复杂度O(N*N) 空间复杂度O(1)
 * @Date: 2024/10/22 15:37
 * @Author: Geollan
 **/
public class Solution01 {
    public int countCompleteDayPairs(int[] hours) {
        int cnt = 0;
        int n = hours.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if((hours[i] + hours[j]) % 24 == 0) cnt++;
            }
        }

        return cnt;
    }
}
