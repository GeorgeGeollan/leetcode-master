package geollan.leetcode.lc649;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Description 队列 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/4/23 10:23
 * @Author: Geollan
 **/
public class Solution01 {
    public String predictPartyVictory(String senate) {
        Deque<Integer> rd = new ArrayDeque<>(), dd = new ArrayDeque<>();
        int n = senate.length();

        for(int i = 0; i < n; i++) {
            if(senate.charAt(i) == 'R') rd.addLast(i);
            else dd.addLast(i);
        }

        while(rd.size() != 0 && dd.size() != 0) {
            int a = rd.pollFirst(), b = dd.pollFirst();

            if(a < b) rd.addLast(a + n);
            else dd.addLast(b + n);
        }

        return rd.size() != 0 ? "Radiant" : "Dire";
    }
}
