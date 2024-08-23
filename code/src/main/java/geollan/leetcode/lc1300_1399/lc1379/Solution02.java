package geollan.leetcode.lc1300_1399.lc1379;

import geollan.utils.TreeNode;

/**
 * @Description 调用本身 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/4/3 14:20
 * @Author: Geollan
 **/
public class Solution02 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null || cloned.val == target.val) return cloned;

        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        TreeNode right = getTargetCopy(original.right, cloned.right, target);

        return left == null ? right : left;
    }
}
