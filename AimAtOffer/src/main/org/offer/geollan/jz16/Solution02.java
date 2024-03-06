package main.org.offer.geollan.jz16;

/**
 * @Description 迭代 时间复杂度O(logN) 空间复杂度O(1)
 * @Date: 2024/3/6 10:26
 * @Author: Geollan
 **/
public class Solution02 {
    public double Power(double base, int exponent) {
        long b = exponent;
        double res = 1;
        if (b < 0) {
            b = -b;
            base = 1 / base;
        }

        while (b > 0) {
            if ((b & 1) == 1)
                res *= base;
            base *= base;
            b >>= 1;
        }

        return res;
    }
}
