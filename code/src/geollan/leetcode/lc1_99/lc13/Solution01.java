package geollan.leetcode.lc1_99.lc13;

import java.util.HashMap;

/**
 * @Description 哈希表 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/6/2 23:09
 * @Author: Geollan
 **/
public class Solution01 {
    public int romanToInt(String s) {
        int ans = 0;
        int n  = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I' && i + 1 < n && (s.charAt(i + 1) == 'X' || s.charAt(i + 1) == 'V')) {
                ans += (map.get(s.charAt(i + 1)) - 1);
                i += 1;
            }

            else if(s.charAt(i) == 'X' && i + 1 < n && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                ans += (map.get(s.charAt(i + 1)) - 10);;
                i += 1;
            }

            else if(s.charAt(i) == 'C' && i + 1 < n && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                ans += (map.get(s.charAt(i + 1)) - 100);;
                i += 1;
            }

            else ans += map.get(s.charAt(i));
        }

        return ans;
    }
}
