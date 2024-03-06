package main.org.offer.geollan.jz16;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/6 10:09
 * @Author: Geollan
 **/
public class Solution01 {
    public double Power(double base, int exponent) {
        boolean postive = true;
        double res = 1;
        if (exponent < 0) {
            postive = false;
            exponent = -exponent;
        }

        while (exponent > 0) {
            res = res * base;
            exponent--;
        }

        return postive ? res : 1 / res;
    }
}
