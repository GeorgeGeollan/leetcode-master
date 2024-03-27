package geollan.leetcode.lc605;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/27 08:39
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0, len = flowerbed.length; i < len && n > 0; ) {
            if(flowerbed[i] == 1) {
                i += 2;
            }

            else if(i == len - 1 || flowerbed[i + 1] == 0) {
                n--;
                i += 2;
            }

            else {
                i += 3;
            }
        }

        return n <= 0;
    }
}
