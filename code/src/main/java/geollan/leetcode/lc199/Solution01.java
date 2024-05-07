package geollan.leetcode.lc199;

import geollan.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description bfs 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/5/7 9:01
 * @Author: Geollan
 **/
public class Solution01 {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                System.out.println(cur.val);
                list.add(cur.val);
                if(cur.right != null) queue.add(cur.right);
                if(cur.left != null) queue.add(cur.left);
            }

            if(list.size() > 0) ans.add(list.get(0));
        }

        return ans;
    }
}
