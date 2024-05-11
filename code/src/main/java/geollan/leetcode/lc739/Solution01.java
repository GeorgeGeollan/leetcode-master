package geollan.leetcode.lc739;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Description 单调栈 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/5/11 9:30
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = n - 1; i >= 0; i--) {
            int t = temperatures[i];
            while(!deque.isEmpty() && t >= temperatures[deque.peek()]) {
                deque.poll();
            }

            if(!deque.isEmpty()) {
                ans[i] = deque.peek() - i;
            }

            deque.push(i);
        }

        return ans;
    }
}
