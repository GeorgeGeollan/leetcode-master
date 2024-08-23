package geollan.leetcode.lc2300_2399.lc2352;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description hashMap 时间复杂度O(MN) 空间复杂度O(N)
 * @Date: 2024/4/15 10:02
 * @Author: Geollan
 **/
public class Solution01 {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> rowMap = new HashMap<>();
        int cnt = 0;

        for(int i = 0; i < grid.length; i++) {
            List<Integer> cur = new ArrayList<>();

            for(int j = 0; j < grid[0].length; j++) {
                cur.add(grid[i][j]);
            }

            rowMap.put(cur, rowMap.getOrDefault(cur, 0) + 1);
        }

        for(int i = 0; i < grid[0].length; i++) {
            List<Integer> cur = new ArrayList<>();

            for(int j = 0; j < grid.length; j++) {
                cur.add(grid[j][i]);
            }

            if(rowMap.containsKey(cur)) {
                cnt += rowMap.get(cur);
            }
        }

        return cnt++;
    }
}