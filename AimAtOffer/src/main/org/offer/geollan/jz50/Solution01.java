package main.org.offer.geollan.jz50;

import java.util.HashMap;

/**
 * @Description 迭代/哈希表（使用Integer） 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/12 09:07
 * @Author: Geollan
 **/
public class Solution01 {
    public int FirstNotRepeatingChar(String str) {
        // write code here
        HashMap<Character, Integer> map = new HashMap<>();
        char[] letter = str.toCharArray();

        for (char c : letter) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < letter.length; i++) {
            if (map.get(letter[i]) == 1)
                return i;
        }

        return -1;
    }
}
