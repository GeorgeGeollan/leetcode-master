package main.org.offer.geollan.jz32;

import java.util.HashMap;

/**
 * @Description 迭代/Boolean（节省空间） 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/12 09:22
 * @Author: Geollan
 **/
public class Solution02 {
    public int FirstNotRepeatingChar(String str) {
        // write code here
        HashMap<Character, Boolean> map = new HashMap<>();
        char[] letter = str.toCharArray();

        for (char c : letter) {
            map.put(c, !map.containsKey(c));
        }

        for (int i = 0; i < letter.length; i++) {
            if (map.get(letter[i]))
                return i;
        }

        return -1;
    }
}
