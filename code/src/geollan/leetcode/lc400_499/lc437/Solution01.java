package geollan.leetcode.lc400_499.lc437;

import geollan.utils.TreeNode;

/**
 * @Description DFS 时间复杂度O(N*N) 空间复杂度O(1)
 * @Date: 2024/5/4 16:27
 * @Author: Geollan
 **/
public class Solution01 {
    int ans, targetSum;
    public int pathSum(TreeNode root, int targetSum) {
        this.targetSum = targetSum;
        dfs1(root);

        return ans;
    }

    public void dfs1(TreeNode root) {
        if(root == null) return;

        dfs2(root, root.val);
        dfs1(root.left);
        dfs1(root.right);
    }

    public void dfs2(TreeNode root, long val) {
        if(val == targetSum) ans++;

        if(root.left != null) dfs2(root.left, val + root.left.val);
        if(root.right != null) dfs2(root.right, val + root.right.val);
    }
}
