package geollan.leetcode.lc1400_1499.lc1450;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/9/1 11:00
 * @Author: Geollan
 **/
public class Solution01 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt = 0;
        for(int i = 0; i < startTime.length; i++) {
            if(startTime[i] <= queryTime && endTime[i] >= queryTime) cnt++;
        }

        return cnt;
    }
}
