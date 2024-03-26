package geollan.newcoder.jz79;

import geollan.newcoder.utils.TreeNode;

/**
 * @Description
 * @Date: 2024/2/7 14:04
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean IsBalanced_Solution(TreeNode pRoot) {
        // write code here
        if (pRoot == null)
            return true;
        int left = deep(pRoot.left);
        int right = deep(pRoot.right);
        if (left - right > 1 || left - right < -1)
            return false;
        return IsBalanced_Solution(pRoot.left) && IsBalanced_Solution(pRoot.right);
    }

    public int deep(TreeNode root) {
        if (root == null)
            return 0;
        int left = deep(root.left);
        int right = deep(root.right);
        return (left > right) ? left + 1 : right + 1;
    }
}
