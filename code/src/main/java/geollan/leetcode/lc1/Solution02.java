package geollan.leetcode.lc1;

import java.util.HashMap;

/**
 * @Description 哈希表 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/5/22 11:21
 * @Author: Geollan
 **/
public class Solution02 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}
