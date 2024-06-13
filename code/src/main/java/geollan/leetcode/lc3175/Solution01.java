package geollan.leetcode.lc3175;

/**
 * @Description 打擂台 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/6/13 9:25
 * @Author: Geollan
 **/
public class Solution01 {
    public int findWinningPlayer(int[] skills, int k) {
        int mxI = 0;
        int win = 0;

        for(int i = 1; i < skills.length & win < k; i++) {
            if(skills[i] > skills[mxI]) {
                mxI = i;
                win = 0;
            }

            win++;
        }

        return mxI;
    }
}
