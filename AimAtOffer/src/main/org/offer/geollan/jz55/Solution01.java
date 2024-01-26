package main.org.offer.geollan.jz55;

import main.org.offer.geollan.utils.TreeNode;

/**
 * @Description 递归 时间复杂度O(N) 空间复杂度O(H) H就是树的高度
 * @Date: 2024/1/26 14:09
 * @Author: Geollan
 **/
public class Solution01 {
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;

        return Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
    }
}
