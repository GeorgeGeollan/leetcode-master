package main.org.offer.geollan.jz70;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/2/25 12:50
 * @Author: Geollan
 **/
public class Solution02 {
    public int rectCover(int target) {
        if (target <= 2)
            return target;

        int a = 1, b = 2, res = 0;
        for (int i = 3; i <= target; i++) {
            res = a + b;
            a = b;
            b = res;
        }

        return res;
    }
}
