package main.org.offer.geollan.jz64;

/**
 * @Description
 * @Date: 2024/3/8 08:55
 * @Author: Geollan
 **/
public class Solution01 {
    int res = 0;

    public int Sum_Solution(int n) {
        boolean x = n > 1 && Sum_Solution(n - 1) > 0;
        res += n;
        return res;
    }
}
