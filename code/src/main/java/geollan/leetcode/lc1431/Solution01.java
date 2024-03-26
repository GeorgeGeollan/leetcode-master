package geollan.leetcode.lc1431;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/26 08:53
 * @Author: Geollan
 **/
public class Solution01 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> isMax = new ArrayList<>();
        for(int candy: candies) {
            max = Math.max(max, candy);
        }

        for(int candy: candies) {
            boolean flag = candy + extraCandies >= max;
            isMax.add(flag);
        }

        return isMax;
    }
}
