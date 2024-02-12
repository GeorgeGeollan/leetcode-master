package main.org.offer.geollan.jz68;

import main.org.offer.geollan.utils.TreeNode;

/**
 * @Description 递归 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/12 21:26
 * @Author: Geollan
 **/
public class Solution01 {
    public int lowestCommonAncestor(TreeNode root, int p, int q) {
        // write code here
        if (root.val == p || root.val == q)
            return root.val;

        if ((root.val > p && root.val < q) || (root.val < p && root.val > q))
            return root.val;

        if (root.val > q && root.val > p)
            return lowestCommonAncestor(root.left, p, q);

        if (root.val < q && root.val < p)
            return lowestCommonAncestor(root.right, p, q);

        return -1;
    }
}
