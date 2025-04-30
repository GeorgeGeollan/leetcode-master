package src.geollan.leetcode.lc1100_1199.lc1184;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/9/16 10:50
 * @Author: Geollan
 **/
public class Solution01 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int ans = 0;
        int total = 0;
        int n = distance.length;
        if(start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }

        for(int i = 0; i < n; i++) {

            if(i >= start && i < destination) ans += distance[i];
            total += distance[i];
        }

        return Math.min(ans, total - ans);
    }
}
