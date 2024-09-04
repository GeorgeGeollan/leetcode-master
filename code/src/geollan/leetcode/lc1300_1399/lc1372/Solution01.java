package geollan.leetcode.lc1300_1399.lc1372;

import geollan.utils.TreeNode;

/**
 * @Description
 * @Date: 2024/5/5 18:53
 * @Author: Geollan
 **/
public class Solution01 {
    int maxLen;
    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;
        maxLen = 0;

        dfs(root, true, 0);
        dfs(root, false, 0);

        return maxLen;
    }

    public void dfs(TreeNode root, boolean dir, int len) {
        maxLen = Math.max(maxLen, len);

        if(dir) {
            if(root.right != null) dfs(root.right, false, len + 1);
            if(root.left != null) dfs(root.left, true, 1);
        }

        else {
            if(root.left != null) dfs(root.left, true, len + 1);
            if(root.right != null) dfs(root.right, false, 1);
        }
    }
}
