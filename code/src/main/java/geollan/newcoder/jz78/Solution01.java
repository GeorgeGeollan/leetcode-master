package geollan.newcoder.jz78;

import geollan.newcoder.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description
 * @Date: 2024/2/10 23:13
 * @Author: Geollan
 **/
public class Solution01 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        // write code here
        if (pRoot == null)
            return new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode root = queue.poll();
                level.add(root.val);

                if (root.left != null)
                    queue.add(root.left);
                if (root.right != null)
                    queue.add(root.right);
            }

            ans.add(level);
        }

        return ans;
    }
}
