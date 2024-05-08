package geollan.leetcode.lc1161;

import geollan.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description bfs 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/5/8 9:01
 * @Author: Geollan
 **/
public class Solution01 {
    int minLevel;
    public int maxLevelSum(TreeNode root) {
        minLevel = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        int maxVal = Integer.MIN_VALUE;
        while(!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                sum += cur.val;
                if(cur.right != null) queue.add(cur.right);
                if(cur.left != null) queue.add(cur.left);
            }

            if(maxVal < sum) {
                maxVal = sum;
                minLevel = level;
            }

            level++;
        }

        return minLevel;
    }
}
