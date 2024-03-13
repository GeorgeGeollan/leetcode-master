package main.org.offer.geollan.jz05;

/**
 * @Description 迭代/遍历字符串 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/13 08:45
 * @Author: Geollan
 **/
public class Solution02 {
    public String replaceSpace(String s) {
        // write code here
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                res += "%20";
            else
                res += s.charAt(i);
        }

        return res;
    }
}
