package src.geollan.leetcode.lc3500_3599.lc3545;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description 暴力破解蠢蛋方法
 * @Date: 2025/5/13 11:31
 * @Author: Geollan
 **/
public class Solution01 {
    public int minDeletion(String s, int k) {
        int[] cnt = new int[26];
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
            set.add(s.charAt(i));
        }

        if(k >= set.size()) return 0;
        int diff = set.size() - k;
        int ans = 0;

        Arrays.sort(cnt);
        System.out.println();
        int start = 26 - set.size();
        int end = start + diff;

        for(int i = start; i < end; i++) {
            ans += cnt[i];
        }

        return ans;
    }
}
