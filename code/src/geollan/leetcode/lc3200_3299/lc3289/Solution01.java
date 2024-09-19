package geollan.leetcode.lc3200_3299.lc3289;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description 哈希表 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/9/18 11:32
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int cnt = 0;

        for(int num: nums) {
            if(set.contains(num)) ans[cnt++] = num;
            set.add(num);
        }

        return ans;
    }
}
