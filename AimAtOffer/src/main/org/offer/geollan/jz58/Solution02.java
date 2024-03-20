package main.org.offer.geollan.jz58;

/**
 * @Description 字符串拼接 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/3/20 09:06
 * @Author: Geollan
 **/
public class Solution02 {
    public String LeftRotateString(String str, int n) {
        if (str.length() == 0)
            return "";
        return str.substring(n % str.length(), str.length()) + str.substring(0, n % str.length());
    }
}
