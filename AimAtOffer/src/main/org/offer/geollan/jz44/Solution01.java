package main.org.offer.geollan.jz44;

/**
 * @Description
 * @Date: 2024/2/21 09:10
 * @Author: Geollan
 **/
public class Solution01 {
    public int findNthDigit(int n) {
        // write code here
        int digit = 1;
        long start = 1;
        long cnt = 9;

        while (n > cnt) {
            n -= cnt;
            digit += 1;
            start *= 10;
            cnt = digit * start * 9;
        }

        long num = start + (n - 1) / digit;
        String num_str = String.valueOf(num);
        return num_str.charAt((n - 1) % digit) - '0';
    }
}
