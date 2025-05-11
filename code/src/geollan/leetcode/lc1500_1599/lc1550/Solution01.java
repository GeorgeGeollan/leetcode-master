package src.geollan.leetcode.lc1500_1599.lc1550;

/**
 * @Description
 * @Date: 2025/5/11 10:26
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean threeConsecutiveOdds(int[] arr) {
        int cnt = 0;

        for(int num: arr) {
            if(num % 2 == 0) {
                cnt = 0;
            }

            else cnt++;

            if(cnt == 3) return true;
        }

        return false;
    }
}
