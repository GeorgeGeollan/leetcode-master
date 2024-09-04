package geollan.leetcode.lc1600_1699.lc1657;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description 笨蛋解决法 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/4/14 12:16
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;

        List<Integer> wordCnt1 = new ArrayList<>();
        List<Integer> wordCnt2 = new ArrayList<>();
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        for(int i = 0; i < word1.length(); i++) {
            cnt1[word1.charAt(i) - 'a']++;
            cnt2[word2.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(cnt1[i] != 0) wordCnt1.add(cnt1[i]);
            if(cnt2[i] != 0) wordCnt2.add(cnt2[i]);

            if(cnt1[i] != 0 && cnt2[i] == 0) return false;
            if(cnt1[i] == 0 && cnt2[i] != 0) return false;
        }

        if(wordCnt1.size() != wordCnt2.size()) return false;

        Collections.sort(wordCnt1);
        Collections.sort(wordCnt2);

        for(int i = 0; i < wordCnt1.size(); i++) {
            if(!wordCnt1.get(i).equals(wordCnt2.get(i))) {
                return false;
            }
        }

        return true;
    }
}
