package main.org.offer.geollan.jz15;

/**
 * @Description 迭代 时间复杂度O(1) 空间复杂度O(1)
 * @Date: 2024/3/5 09:34
 * @Author: Geollan
 **/
public class Solution01 {
    public int NumberOf1(int n) {
        // write code here
        int cnt = 0;

        for (int i = 0; i < 32; i++) {
            cnt = (n & 1) == 1 ? cnt + 1 : cnt;
            n >>= 1;
        }

        return cnt;
    }
}
