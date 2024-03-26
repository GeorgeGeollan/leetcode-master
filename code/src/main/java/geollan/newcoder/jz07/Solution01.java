package geollan.newcoder.jz07;

import java.util.HashMap;

import main.org.offer.geollan.utils.TreeNode;

/**
 * @Description 递归 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/1/29 14:12
 * @Author: Geollan
 **/
public class Solution01 {
    int[] preOrder;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode reConstructBinaryTree(int[] preOrder, int[] vinOrder) {
        this.preOrder = preOrder;
        for (int i = 0; i < preOrder.length; i++)
            map.put(vinOrder[i], i);

        return buildTree(0, 0, preOrder.length - 1);
    }

    public TreeNode buildTree(int root, int left, int right) {
        if (left > right)
            return null;

        TreeNode node = new TreeNode(preOrder[root]);
        int newIdx = map.get(preOrder[root]);
        // 构建左子树节点
        node.left = buildTree(root + 1, left, newIdx - 1);
        // 构建右子树节点
        // newIdx - left + root + 1含义为 根节点索引 + 左子树长度 + 1
        node.right = buildTree(root + newIdx - left + 1, newIdx + 1, right);
        return node;
    }
}
