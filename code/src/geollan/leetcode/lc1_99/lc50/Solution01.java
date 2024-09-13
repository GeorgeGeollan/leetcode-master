package geollan.leetcode.lc1_99.lc50;

/**
 * @Description 时间复杂度O(logN) 空间复杂度O(1)
 * @Date: 2024/9/13 14:53
 * @Author: Geollan
 **/
public class Solution01 {
    public double myPow(double x, int n) {
        if(n == 0 || x == 1) return 1;
        if(x == -1 && n % 2 == 0) return 1;
        if(x == -1 && n % 2 == 1) return -1;
        if(n == Integer.MIN_VALUE) return 0;
        double res = 1;
        double cur = x;
        boolean isPositive = true;

        if(n < 0) {
            isPositive = false;
            n = -n;
        }

        while(n > 1) {
            int mod = n % 2;
            if(mod == 1) res *= cur;
            cur = cur * cur;
            n /= 2;
        }

        return isPositive ? res * cur : 1 / (res * cur);
    }
}
