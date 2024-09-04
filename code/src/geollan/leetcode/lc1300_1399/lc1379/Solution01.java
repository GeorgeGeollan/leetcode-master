package geollan.leetcode.lc1300_1399.lc1379;

import geollan.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description
 * @Date: 2024/4/3 11:17
 * @Author: Geollan
 **/
public class Solution01 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(cloned);

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if(cur.val == target.val) return cur;

                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
            }
        }

        return null;
    }
}
