package geollan.newcoder.jz77;

import geollan.newcoder.utils.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description 迭代/双向链表 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/1/27 13:54
 * @Author: Geollan
 **/
public class Solution01 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        // write code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (pRoot == null)
            return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            Deque<Integer> cur = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode root = queue.poll();
                if (level % 2 == 1)
                    cur.addFirst(root.val);
                else
                    cur.addLast(root.val);
                if (root.left != null)
                    queue.add(root.left);
                if (root.right != null)
                    queue.add(root.right);
            }

            level++;
            ans.add(new ArrayList<>(cur));
        }

        return ans;
    }
}
