package main.org.offer.geollan.jz27;

import main.org.offer.geollan.utils.TreeNode;

/**
 * @Description 递归/原地操作/Geollan版本 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/1/31 14:37
 * @Author: Geollan
 **/
public class Solution01 {
    public TreeNode Mirror(TreeNode pRoot) {
        // write code here
        if (pRoot == null)
            return null;

        TreeNode tmpLeft = pRoot.left;
        TreeNode tmpRight = pRoot.right;
        pRoot.left = tmpRight;
        pRoot.right = tmpLeft;

        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}
