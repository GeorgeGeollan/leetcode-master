package geollan.leetcode.lc3000_3099.lc3019;

/**
 * @Description 巧妙利用位运算
 * @Date: 2025/1/7 8:38
 * @Author: Geollan
 **/
public class Solution02 {
    public int countKeyChanges(String s) {
        int count = 0;

        for(int i = 1; i < s.length(); i++) {
            if((s.charAt(i - 1) & 31) != (s.charAt(i) & 31)) count++;
        }

        return count;
    }
}
