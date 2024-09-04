package geollan.leetcode.lc3200_3299.lc3232;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/7/30 15:34
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean canAliceWin(int[] nums) {
        int ones = 0;
        int twos = 0;

        for(int num: nums) {
            if(num < 10) ones += num;
            else twos += num;
        }

        return twos == ones ? false : true;
    }
}
