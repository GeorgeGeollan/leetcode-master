package geollan.leetcode.lc3000_3099.lc3019;

/**
 * @Description 通过差值来比较是否是大小写一致的情况
 * @Date: 2025/1/7 8:37
 * @Author: Geollan
 **/
public class Solution01 {
    public int countKeyChanges(String s) {
        int count = 0;
        char prev = s.charAt(0);

        for(int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if(Math.abs(cur - prev) == 32 || cur - prev == 0) continue;
            else count++;
            prev = cur;
        }

        return count;
    }
}
