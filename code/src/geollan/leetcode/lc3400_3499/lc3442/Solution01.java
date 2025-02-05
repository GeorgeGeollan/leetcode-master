package src.geollan.leetcode.lc3400_3499.lc3442;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2025/2/5 19:31
 * @Author: Geollan
 **/
public class Solution01 {
    public int maxDifference(String s) {
        int[] cnt = new int[26];

        for (char ch : s.toCharArray()) {
            cnt[ch - 'a']++;
        }

        int oddCnt = 0, evenCnt = s.length();

        for (int i = 0; i < 26; i++) {
            if (cnt[i] == 0) continue;
            if (cnt[i] % 2 == 0) {
                evenCnt = Math.min(evenCnt, cnt[i]);
            } else {
                oddCnt = Math.max(oddCnt, cnt[i]);
            }
        }

        return oddCnt - evenCnt;

    }
}

