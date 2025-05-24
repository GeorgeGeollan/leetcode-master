package src.geollan.leetcode.lc2900_2999.lc2942;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Date: 2025/5/24 11:27
 * @Author: Geollan
 **/
public class Solution01 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            if(findChar(words[i], x)) list.add(i);
        }

        return list;
    }

    public boolean findChar(String word, char target) {
        char[] letter = word.toCharArray();
        for(char l: letter) {
            if(l == target) return true;
        }

        return false;
    }
}
