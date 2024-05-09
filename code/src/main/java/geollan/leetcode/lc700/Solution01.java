package geollan.leetcode.lc700;

import geollan.utils.TreeNode;

/**
 * @Description 利用二叉搜索树特性解决问题 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/5/9 8:56
 * @Author: Geollan
 **/
public class Solution01 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;

        while(root != null) {
            if(root.val > val) root = root.left;
            else if(root.val < val) root = root.right;
            else return root;
        }

        return root;
    }
}
