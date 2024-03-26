package geollan.newcoder.jz08;

import geollan.newcoder.utils.TreeLinkNode;

import java.util.ArrayList;


/**
 * @Description 递归/中序遍历 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/8 18:16
 * @Author: Geollan
 **/
public class Solution01 {
    ArrayList<TreeLinkNode> list = new ArrayList<>();

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        // 找到头节点
        TreeLinkNode root = pNode;
        while (root.next != null)
            root = root.next;
        dfs(root);
        int idx = -1, n = list.size();

        for (int i = 0; i < n; i++) {
            if (list.get(i).equals(pNode)) {
                idx = i;
                break;
            }
        }

        return idx == -1 || idx == n - 1 ? null : list.get(idx + 1);
    }

    public void dfs(TreeLinkNode root) {
        if (root == null)
            return;

        dfs(root.left);
        list.add(root);
        dfs(root.right);
    }
}
