package geollan.newcoder.jz48;

import java.util.HashMap;

/**
 * @Description 迭代 时间复杂度(N) 空间复杂度O(1)
 * @Date: 2024/2/27 09:27
 * @Author: Geollan
 **/
public class Solution01 {
    public int lengthOfLongestSubstring(String s) {
        // write code here
        HashMap<Character, Integer> dic = new HashMap<>();
        int i = -1, res = 0, n = s.length();
        char[] words = s.toCharArray();

        for (int j = 0; j < n; j++) {
            if (dic.containsKey(words[j])) {
                i = Math.max(i, dic.get(words[j]));
            }

            dic.put(words[j], j);
            res = Math.max(res, j - i);
        }

        return res;
    }
}
