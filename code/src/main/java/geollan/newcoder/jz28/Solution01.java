package geollan.newcoder.jz28;
import geollan.newcoder.utils.TreeNode;
/**
 * @Description 递归 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/9 20:51
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean isSymmetrical(TreeNode pRoot) {
        // write code here
        if (pRoot == null)
            return true;
        return isSame(pRoot.left, pRoot.right);
    }

    public boolean isSame(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return true;
        if (a == null || b == null)
            return false;
        if (a.val != b.val)
            return false;

        return isSame(a.left, b.right) && isSame(b.left, a.right);
    }
}
