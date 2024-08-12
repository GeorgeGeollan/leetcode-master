package geollan.leetcode.lc3248;

import java.util.List;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/8/12 9:12
 * @Author: Geollan
 **/
public class Solution01 {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int startIdx = 0;

        for(String command: commands) {
            if(command.equals("UP")) startIdx -= n;
            else if (command.equals("DOWN")) startIdx += n;
            else if(command.equals("LEFT")) startIdx -= 1;
            else startIdx += 1;
        }

        return startIdx;
    }
}
