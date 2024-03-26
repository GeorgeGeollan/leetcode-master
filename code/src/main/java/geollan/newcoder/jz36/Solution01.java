package geollan.newcoder.jz36;

import main.org.offer.geollan.utils.TreeNode;

/**
 * @Description
 * @Date: 2024/2/5 14:49
 * @Author: Geollan
 **/
public class Solution01 {
    TreeNode cur, head;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        Convert(pRootOfTree.left);
        if (cur == null) {
            cur = pRootOfTree;
            head = pRootOfTree;
        }

        else {
            cur.right = pRootOfTree;
            pRootOfTree.left = cur;
            cur = pRootOfTree;
        }

        Convert(pRootOfTree.right);
        return head;
    }
}
