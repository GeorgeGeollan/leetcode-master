package main.org.offer.geollan.jz26;

import main.org.offer.geollan.utils.TreeNode;

/**
 * @Description 递归 时间复杂度O(MN) 空间复杂度O(M) MN分别为AB节点数量
 * @Date: 2024/1/30 16:21
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null)
            return false;

        return isSame(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    public boolean isSame(TreeNode root1, TreeNode root2) {
        if (root2 == null)
            return true;
        else if (root1 == null || root1.val != root2.val)
            return false;

        return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
    }
}
