package geollan.leetcode.lc1200_1299.lc1207;

import java.util.HashSet;

/**
 * @Description
 * @Date: 2024/4/13 14:21
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean uniqueOccurrences(int[] arr) {
        int[] cnt = new int[2001];
        HashSet<Integer> isOccur = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            cnt[arr[i] + 1000]++;
        }

        for(int i = 0; i <= 2000; i++) {
            if(cnt[i] == 0) continue;

            if(isOccur.contains(cnt[i])) return false;

            isOccur.add(cnt[i]);
        }

        return true;
    }
}
