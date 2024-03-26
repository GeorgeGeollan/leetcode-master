package geollan.newcoder.jz86;

import geollan.newcoder.utils.TreeNode;

/**
 * @Description 递归 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/13 21:23
 * @Author: Geollan
 **/
public class Solution01 {
    public int lowestCommonAncestor(TreeNode root, int o1, int o2) {
        // write code here
        if (root == null || root.val == o1 || root.val == o2)
            return root == null ? -1 : root.val;
        int left = lowestCommonAncestor(root.left, o1, o2);
        int right = lowestCommonAncestor(root.right, o1, o2);
        if (left == -1 && right == -1)
            return -1;
        if (left == -1)
            return right;
        if (right == -1)
            return left;
        return root.val;
    }
}
