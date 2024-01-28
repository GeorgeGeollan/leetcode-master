package main.org.offer.geollan.jz54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import main.org.offer.geollan.utils.TreeNode;

/**
 * @Description 迭代/BFS/List排序 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/1/28 20:00
 * @Author: Geollan
 **/
public class Solution01 {
    public int KthNode(TreeNode proot, int k) {
        // write code here
        if (proot == null || k <= 0)
            return -1;

        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(proot);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode root = queue.poll();
                list.add(root.val);
                if (root.left != null)
                    queue.add(root.left);
                if (root.right != null)
                    queue.add(root.right);
            }
        }

        if (k > list.size())
            return -1;

        Collections.sort(list);

        return list.get(k - 1);
    }
}
