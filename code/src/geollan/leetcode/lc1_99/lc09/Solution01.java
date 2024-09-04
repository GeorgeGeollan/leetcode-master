package geollan.leetcode.lc1_99.lc09;

/**
 * @Description
 * @Date: 2024/5/31 10:02
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int n = str.length();

        int l = 0, r = n - 1;

        while(l < r) {
            if(str.charAt(l) != str.charAt(r)) return false;

            l++;
            r--;
        }

        return true;
    }
}
