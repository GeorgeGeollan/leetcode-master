package geollan.leetcode.lc104;

import geollan.utils.TreeNode;

/**
 * @Description 递归 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/4/27 21:29
 * @Author: Geollan
 **/
public class Solution01 {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
