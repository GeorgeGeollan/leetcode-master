package main.org.offer.geollan.jz84;

import main.org.offer.geollan.utils.TreeNode;

/**
 * @Description
 * @Date: 2024/2/11 22:20
 * @Author: Geollan
 **/
public class Solution01 {
    public int FindPath(TreeNode root, int sum) {
        // write code here
        if (root == null)
            return 0;
        int res = dfs(root, sum);
        res += FindPath(root.left, sum);
        res += FindPath(root.right, sum);

        return res;
    }

    public int dfs(TreeNode root, int sum) {
        if (root == null)
            return 0;

        int res = 0;
        int val = root.val;
        if (val == sum)
            res++;

        res += dfs(root.left, sum - val);
        res += dfs(root.right, sum - val);
        return res;
    }
}
