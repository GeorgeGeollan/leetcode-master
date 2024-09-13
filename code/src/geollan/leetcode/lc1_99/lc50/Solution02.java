package geollan.leetcode.lc1_99.lc50;

/**
 * @Description 时间复杂度O(logN) 空间复杂度O(1) 改良版
 * @Date: 2024/9/13 15:02
 * @Author: Geollan
 **/
public class Solution02 {
    public double myPow(double x, int n) {
        if(x == 0) return 0;

        long b = n;
        double res = 1;
        if(n < 0) {
            x = 1 / x;
            b = -b;
        }

        while(b > 0) {
            if((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }

        return res;
    }
}
