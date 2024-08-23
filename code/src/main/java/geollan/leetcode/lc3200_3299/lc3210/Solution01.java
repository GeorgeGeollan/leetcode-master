package geollan.leetcode.lc3200_3299.lc3210;

/**
 * @Description StringBuilder 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/7/18 8:58
 * @Author: Geollan
 **/
public class Solution01 {
    public String getEncryptedString(String s, int k) {
        StringBuilder sb = new StringBuilder();

        int n = s.length(), start = 0;
        while(start < n) {
            int idx = (start + k) % n;
            start++;
            sb.append(s.charAt(idx));
        }

        return sb.toString();
    }
}
