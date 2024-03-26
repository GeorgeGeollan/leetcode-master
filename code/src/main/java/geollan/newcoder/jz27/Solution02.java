package geollan.newcoder.jz27;

import main.org.offer.geollan.utils.TreeNode;

/**
 * @Description 递归/原地操作/Krahets版本 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/1/31 15:38
 * @Author: Geollan
 **/
public class Solution02 {
    public TreeNode Mirror(TreeNode pRoot) {
        // write code here
        if (pRoot == null)
            return null;
        TreeNode tmp = pRoot.left;
        pRoot.left = Mirror(pRoot.right);
        pRoot.right = Mirror(tmp);
        return pRoot;
    }
}
