package geollan.newcoder.jz68;

import geollan.newcoder.utils.TreeNode;

/**
 * @Description 递归 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/2/12 21:50
 * @Author: Geollan
 **/
public class Solution02 {
    public int lowestCommonAncestor(TreeNode root, int p, int q) {
        // write code here
        while (root != null) {
            if (root.val > p && root.val > q)
                root = root.left;
            if (root.val < p && root.val < q)
                root = root.right;
            else
                break;
        }

        return root == null ? -1 : root.val;
    }
}
