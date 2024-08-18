package geollan.leetcode.lc551;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/8/18 10:28
 * @Author: Geollan
 **/
public class Solution01 {
    class Solution {
        public boolean checkRecord(String s) {
            int cntA = 0, cntL = 0;

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'A') cntA++;
                if(s.charAt(i) != 'L') cntL = 0;
                if(s.charAt(i) == 'L') cntL++;
                if(cntL >= 3 || cntA >= 2) return false;
            }


            return true;
        }
    }
}
