package main.org.offer.geollan.jz77;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import main.org.offer.geollan.utils.TreeNode;

/**
 * @Description
 * @Date: 2024/1/27 14:37
 * @Author: Geollan
 **/
public class Solution02 {
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
            ArrayList<Integer> cur = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode root = queue.poll();
                cur.add(root.val);
                if (root.left != null)
                    queue.add(root.left);
                if (root.right != null)
                    queue.add(root.right);
            }

            if (level % 2 == 1)
                Collections.reverse(cur);
            level++;
            ans.add(cur);
        }

        return ans;
    }
}
