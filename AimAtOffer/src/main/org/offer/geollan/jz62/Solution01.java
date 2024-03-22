package main.org.offer.geollan.jz62;

/**
 * @Description 迭代/约瑟夫环 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/22 09:16
 * @Author: Geollan
 **/
public class Solution01 {
    public int LastRemaining_Solution (int n, int m) {
        // write code here
        int x = 0;
        for(int i = 2; i <= n; i++) {
            x = (x + m) % i;
        }

        return x;
    }
}
