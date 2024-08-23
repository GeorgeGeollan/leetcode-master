package geollan.leetcode.lc1400_1499.lc1448;

import geollan.utils.TreeNode;

/**
 * @Description
 * @Date: 2024/4/30 9:52
 * @Author: Geollan
 **/
public class Solution01 {
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    public int dfs(TreeNode root, int mx) {
        if(root == null) return 0;

        int left = dfs(root.left, Math.max(mx, root.val));
        int right = dfs(root.right, Math.max(mx, root.val));

        return left + right + (mx <= root.val ? 1 : 0);
    }
}
