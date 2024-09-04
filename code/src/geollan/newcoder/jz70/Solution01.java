package geollan.newcoder.jz70;

/**
 * @Description 递归 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/25 12:46
 * @Author: Geollan
 **/
public class Solution01 {
    public int rectCover(int target) {
        if (target <= 2)
            return target;

        return rectCover(target - 1) + rectCover(target - 2);
    }
}
