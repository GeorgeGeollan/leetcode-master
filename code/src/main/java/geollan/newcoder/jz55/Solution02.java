package geollan.newcoder.jz55;

import geollan.newcoder.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description 迭代/BFS 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/1/26 14:21
 * @Author: Geollan
 **/
public class Solution02 {
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;

        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }

            level++;
        }

        return level;
    }
}
