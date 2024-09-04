package geollan.leetcode.lc1_99.lc8;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/6/3 9:41
 * @Author: Geollan
 **/
public class Solution01 {
    public int myAtoi(String s) {
        s = s.trim();
        if(s == null || s.length() == 0) return 0;
        int len = s.length(), res = 0, idx = 0, sign = 1;
        char first = s.charAt(idx);
        if(first == '-') {
            sign = -1;
            idx++;
        }

        else if(first == '+') idx++;
        int last = 0;
        while(idx < len) {
            if(s.charAt(idx) < '0' || s.charAt(idx) > '9') break;
            int temp = s.charAt(idx) - '0';
            last = res;
            res = temp + res * 10;
            if(last != res / 10) return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            idx++;
        }

        return res * sign;
    }
}
