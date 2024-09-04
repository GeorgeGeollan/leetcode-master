package geollan.newcoder.jz56;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/7 09:15
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] FindNumsAppearOnce(int[] nums) {
        // write code here
        int m = 1, x = 0, y = 0, z = 0;

        for (int num : nums) {
            x ^= num;
        }

        while ((x & m) == 0) {
            m <<= 1;
        }

        for (int num : nums) {
            if ((m & num) == 0)
                y ^= num;
            else
                z ^= num;
        }

        return y > z ? new int[] {z, y} : new int[] {y, z};
    }
}
