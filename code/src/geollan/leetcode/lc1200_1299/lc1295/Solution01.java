package src.geollan.leetcode.lc1200_1299.lc1295;

/**
 * @Description
 * @Date: 2025/4/30 8:49
 * @Author: Geollan
 **/
public class Solution01 {
    public int findNumbers(int[] nums) {
        int cnt = 0;

        for(int num: nums) {
            cnt += shiftRight(num) % 2 == 0 ? 1 : 0;
        }

        return cnt;
    }

    public int shiftRight(int num) {
        int cnt = 0;
        while(num > 0) {
            num /= 10;
            cnt++;
        }

        return cnt;
    }
}
