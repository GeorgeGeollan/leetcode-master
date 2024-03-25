package geollan.leetcode.lc1071;

/**
 * @Description 计算两个字符串的最大公因数 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/3/25 09:32
 * @Author: Geollan
 **/
public class Solution02 {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";

        return str2.substring(0, gcd(str1.length(), str2.length()));
    }

    public int gcd(int len1, int len2) {
        return len2 == 0 ? len1 : gcd(len2, len1 % len2);
    }
}
