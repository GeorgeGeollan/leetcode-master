package geollan.leetcode.lc07;

/**
 * @Description
 * @Date: 2024/5/29 10:54
 * @Author: Geollan
 **/
public class Solution01 {
    public int reverse(int x) {
        long res = 0;
        int negative = 1;

        if(x < 0)  {
            negative = -1;
            x = -x;
        }

        while(x > 0) {
            res *= 10;
            res += x % 10;
            x /= 10;

        }

        res = res * negative;

        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int)res;
    }
}
