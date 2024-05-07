package geollan.leetcode.lc236;

import geollan.utils.TreeNode;

/**
 * @Description dfs 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/5/6 9:21
 * @Author: Geollan
 **/
public class Solution01 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }
}
