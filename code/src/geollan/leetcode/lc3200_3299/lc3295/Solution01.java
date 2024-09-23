package geollan.leetcode.lc3200_3299.lc3295;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Description 时间复杂度: O((N+M)L)  空间复杂度: O(ML)
 * @Date: 2024/9/23 14:56
 * @Author: Geollan
 **/
public class Solution01 {
    // N message长度  M bannedWords长度   L是字符串最大长度
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> banned = new HashSet<>(Arrays.asList(bannedWords));
        int cnt = 0;

        for(String s: message) {
            if(banned.contains(s) && ++cnt > 1) return true;
        }

        return false;
    }
}
