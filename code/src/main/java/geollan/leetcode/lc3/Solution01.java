package geollan.leetcode.lc3;

import java.util.HashMap;

/**
 * @Description 双指针 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/5/24 9:38
 * @Author: Geollan
 **/
public class Solution01 {
    public int lengthOfLongestSubstring(String s) {
        int i = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0, n = s.length();
        for(int j = 0; j < n; j++) {
            if(map.containsKey(s.charAt(j))) i = Math.max(i, map.get(s.charAt(j)));
            map.put(s.charAt(j), j);
            res = Math.max(res, j - i);
        }

        return res;
    }
}
