package geollan.leetcode.lc800_899.lc841;

import java.util.List;

/**
 * @Description dfs 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/5/12 17:27
 * @Author: Geollan
 **/
public class Solution01 {
    int nums;
    boolean[] visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        nums = 0;
        visited = new boolean[n];
        dfs(rooms, 0);

        return nums == n;
    }

    public void dfs(List<List<Integer>> rooms, int level) {
        visited[level] = true;
        nums++;

        for(int it: rooms.get(level)) {
            if(!visited[it]) {
                dfs(rooms, it);
            }
        }
    }
}
