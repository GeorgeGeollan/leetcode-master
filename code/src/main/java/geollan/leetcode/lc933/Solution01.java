package geollan.leetcode.lc933;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description 队列 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/22 9:45
 * @Author: Geollan
 **/
public class Solution01 {
    class RecentCounter {
        Queue<Integer> queue;
        public RecentCounter() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {
            queue.add(t);

            while(queue.peek() < t - 3000) queue.poll();

            return queue.size();
        }
    }
}
