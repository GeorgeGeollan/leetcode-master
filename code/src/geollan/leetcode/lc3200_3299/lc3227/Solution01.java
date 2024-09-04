package geollan.leetcode.lc3200_3299.lc3227;

/**
 * @Description 脑筋急转弯 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/7/24 9:19
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean doesAliceWin(String s) {
        for(char c: s.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        }

        return false;
    }
}
