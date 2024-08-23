package geollan.leetcode.lc800_899.lc872;

import geollan.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description List比较 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/4/29 9:29
 * @Author: Geollan
 **/
public class Solution01 {
    List<Integer> arr1;
    List<Integer> arr2;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        arr1 = new ArrayList<>();
        arr2 = new ArrayList<>();
        helper(root1, arr1);
        helper(root2, arr2);

        if(arr1.size() != arr2.size()) return false;

        for(int i = 0; i < arr1.size(); i++) {
            if(!arr1.get(i).equals(arr2.get(i))) return false;
        }

        return true;
    }

    public void helper(TreeNode root, List<Integer> arr) {
        if(root == null) return;

        if(root.left == null && root.right == null) arr.add(root.val);
        helper(root.left, arr);
        helper(root.right, arr);
    }
}
