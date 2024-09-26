package geollan.leetcode.lc3200_3299.lc3296;

import java.util.PriorityQueue;

/**
 * @Description
 * @Date: 2024/9/25 9:55
 * @Author: Geollan
 **/
public class Solution01 {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        long ans = 0;
        for(int t: workerTimes) {
            pq.offer(new long[] {t, t, t});
        }

        while(mountainHeight-- > 0) {
            long[] cur = pq.poll();
            ans = cur[0];

            pq.offer(new long[] {cur[0] + cur[1] + cur[2], cur[1] + cur[2], cur[2]});
        }

        return ans;
    }
}
