package main.org.offer.geollan.jz54;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import main.org.offer.geollan.utils.TreeNode;

/**
 * @Description 迭代/BFS/优先队列 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/1/28 20:09
 * @Author: Geollan
 **/
public class Solution02 {
    public int KthNode(TreeNode proot, int k) {
        // write code here
        if (proot == null || k <= 0)
            return -1;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(proot);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode root = queue.poll();
                pq.add(root.val);
                if (pq.size() > k)
                    pq.poll();

                if (root.left != null)
                    queue.add(root.left);
                if (root.right != null)
                    queue.add(root.right);
            }
        }

        return pq.size() < k ? -1 : pq.peek();
    }
}
