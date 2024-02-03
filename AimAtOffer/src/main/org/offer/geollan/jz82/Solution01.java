package main.org.offer.geollan.jz82;

import main.org.offer.geollan.utils.TreeNode;

/**
 * @Description 递归/DFS 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/3 23:15
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean hasPathSum(TreeNode root, int sum) {
        // write code here
        if (root == null)
            return false;
        return recur(root, sum);
    }

    public boolean recur(TreeNode root, int sum) {
        if (root == null)
            return false;

        sum = sum - root.val;
        if (root.right == null && root.left == null && sum == 0)
            return true;
        return recur(root.left, sum) || recur(root.right, sum);
    }
}
