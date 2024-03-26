package geollan.newcoder.jz34;

import geollan.newcoder.utils.TreeNode;

import java.util.ArrayList;


/**
 * @Description 递归 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/4 15:29
 * @Author: Geollan
 **/
public class Solution01 {
    ArrayList<ArrayList<Integer>> ans;

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        // write code here
        ans = new ArrayList<>();
        recur(root, target, new ArrayList<Integer>());
        return ans;
    }

    public void recur(TreeNode root, int sum, ArrayList<Integer> list) {
        if (root == null)
            return;

        list.add(root.val);
        sum -= root.val;
        recur(root.left, sum, new ArrayList<>(list));
        recur(root.right, sum, new ArrayList<>(list));
        if (root.left == null && root.right == null & sum == 0)
            ans.add(list);
    }
}
