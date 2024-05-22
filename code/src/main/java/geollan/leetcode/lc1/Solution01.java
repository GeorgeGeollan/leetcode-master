package geollan.leetcode.lc1;

/**
 * @Description 穷举法 时间复杂度O(N*N) 空间复杂度O(1)
 * @Date: 2024/5/22 11:10
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(nums[i] + nums[j] == target) return new int[] {i, j};
            }
        }

        return null;
    }
}
