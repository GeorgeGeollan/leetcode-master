package geollan.leetcode.lc3170;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Date: 2024/6/11 12:42
 * @Author: Geollan
 **/
public class Solution01 {
    public String clearStars(String s) {
        char[] ch = s.toCharArray();
        int n = s.length();
        List<Integer>[] st = new ArrayList[26];
        Arrays.setAll(st, i -> new ArrayList<>());

        for(int i = 0; i < n; i++) {
            if(ch[i] != '*') {
                st[ch[i] - 'a'].add(i);
                continue;
            }

            for(List<Integer> p: st) {
                if(!p.isEmpty()) {
                    ch[p.remove(p.size() - 1)] = '*';
                    break;
                }
            }
        }

        StringBuilder t = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(ch[i] != '*') t.append(ch[i]);
        }

        return t.toString();
    }
}
