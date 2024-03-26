package geollan.newcoder.jz27;

import java.util.Stack;

import main.org.offer.geollan.utils.TreeNode;

/**
 * @Description 迭代/辅助栈 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/1/31 15:49
 * @Author: Geollan
 **/
public class Solution03 {
    public TreeNode Mirror(TreeNode pRoot) {
        // write code here
        if (pRoot == null)
            return null;

        Stack<TreeNode> stack = new Stack<>();
        stack.add(pRoot);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null)
                stack.add(node.left);
            if (node.right != null)
                stack.add(node.right);
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }

        return pRoot;
    }
}
