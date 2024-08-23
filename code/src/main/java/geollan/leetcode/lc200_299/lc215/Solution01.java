package geollan.leetcode.lc200_299.lc215;

import java.util.PriorityQueue;

/**
 * @Description 优先队列 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/5/14 16:47
 * @Author: Geollan
 **/
public class Solution01 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);

        for(int num: nums) {
            pq.add(num);
            if(pq.size() == k + 1) pq.poll();
        }

        return pq.peek();
    }
}
