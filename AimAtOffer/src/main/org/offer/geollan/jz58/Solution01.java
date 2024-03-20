package main.org.offer.geollan.jz58;

/**
 * @Description 迭代/StringBuilder 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/3/20 09:00
 * @Author: Geollan
 **/
public class Solution01 {
    public String LeftRotateString(String str, int n) {
        // write code here
        int len = str.length();
        if (len == 0)
            return "";
        int shift = n >= len ? n % len : n;
        StringBuilder sb = new StringBuilder();

        for (int i = shift; i < len; i++) {
            sb.append(str.charAt(i));
        }

        for (int i = 0; i < shift; i++) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
