package geollan.leetcode.lc3200_3299.lc3275;

import java.util.PriorityQueue;

/**
 * @Description
 * @Date: 2024/9/4 14:26
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] resultsArray(int[][] queries, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int[] ans = new int[queries.length];
        int cnt = 0;

        for(int[] query: queries) {
            pq.add(Math.abs(query[0]) + Math.abs(query[1]));
            if(pq.size() > k) pq.poll();
            if(pq.size() < k) ans[cnt++] = -1;
            else ans[cnt++] = pq.peek();
        }

        return ans;
    }
}
