package geollan.leetcode.lc14;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/6/2 23:12
 * @Author: Geollan
 **/
public class Solution01 {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int n = strs[0].length();
        String first = strs[0];

        for(int i = 0; i < n; i++) {
            char ch = first.charAt(i);

            for(int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length()) return ans;
                if(strs[j].charAt(i) != ch) return ans;
            }

            ans += ch;
        }

        return ans;
    }
}
