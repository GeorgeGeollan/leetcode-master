package main.org.offer.geollan.jz43;

/**
 * @Description 递归 时间复杂度O(logN) 空间复杂度O(1)
 * @Date: 2024/3/15 10:10
 * @Author: Geollan
 **/
public class Solution02 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int high = n / 10, cur = n % 10, low = 0;
        int digit = 1, ans = 0;
        while (high != 0 || cur != 0) {
            if (cur == 0)
                ans += high * digit;
            else if (cur == 1)
                ans += high * digit + low + 1;
            else
                ans += (high + 1) * digit;
            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
        }

        return ans;
    }
}
