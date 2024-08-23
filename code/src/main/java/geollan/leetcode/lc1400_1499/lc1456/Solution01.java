package geollan.leetcode.lc1400_1499.lc1456;

import java.util.HashSet;

/**
 * @Description 双指针 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/7 10:28
 * @Author: Geollan
 **/
public class Solution01 {
    public int maxVowels(String s, int k) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int cnt = 0;

        for(int i = 0; i < k; i++) {
            if(vowels.contains(s.charAt(i))) cnt++;
        }

        int maxCnt = cnt;

        for(int i = k; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i - k)) && !vowels.contains(s.charAt(i))) cnt--;
            else if(!vowels.contains(s.charAt(i - k)) && vowels.contains(s.charAt(i))) cnt++;

            maxCnt = Math.max(maxCnt, cnt);
        }

        return maxCnt;
    }
}
