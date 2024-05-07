package geollan.leetcode.lc199;

import geollan.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description dfs 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/5/7 9:18
 * @Author: Geollan
 **/
public class Solution02 {
    public final List<Integer> ans = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    public void dfs(TreeNode root, int depth) {
        if(root == null) return;
        if(depth == ans.size()) ans.add(root.val);
        dfs(root.right, depth + 1);
        dfs(root.left, depth + 1);
    }
}
