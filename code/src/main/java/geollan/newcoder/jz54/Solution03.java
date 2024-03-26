package geollan.newcoder.jz54;

import geollan.newcoder.utils.TreeNode;

/**
 * @Description 递归/中序遍历 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/1/28 20:29
 * @Author: Geollan
 **/
public class Solution03 {
    int ans = -1;
    int k;

    public int KthNode(TreeNode proot, int k) {
        // write code here
        this.k = k;
        dfs(proot);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        if (k == 0)
            return;
        if (--k == 0)
            ans = root.val;
        dfs(root.right);

        return;
    }
}
