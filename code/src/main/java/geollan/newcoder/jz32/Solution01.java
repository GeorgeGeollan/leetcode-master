package geollan.newcoder.jz32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import geollan.newcoder.utils.TreeNode;

/**
 * @Description 迭代/层序遍历 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/1 14:32
 * @Author: Geollan
 **/
public class Solution01 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null)
            return new ArrayList<Integer>();

        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                ans.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }

        return ans;
    }
}
