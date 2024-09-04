package geollan.leetcode.lc3100_3199.lc3159;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description list记录出现的下标  时间复杂度O(M+N) 空间复杂度O(N)
 * @Date: 2024/6/20 10:26
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int size = 0;
        List<Integer> cnt = new ArrayList<>();
        int[] ans = new int[queries.length];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == x) {
                cnt.add(i);
                size++;
            }
        }


        for(int i = 0; i < queries.length; i++) {
            if(queries[i] > size) ans[i] = -1;

            else ans[i] = cnt.get(queries[i] - 1);
        }

        return ans;
    }
}
