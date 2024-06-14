package geollan.leetcode.lc3178;

/**
 * @Description
 * @Date: 2024/6/14 10:41
 * @Author: Geollan
 **/
public class Solution01 {
    public int numberOfChild(int n, int k) {
        int mul = k / (n - 1);
        int mod = k % (n - 1);

        if(mul % 2 == 0) return mod;
        return n - 1 - mod;
    }
}
