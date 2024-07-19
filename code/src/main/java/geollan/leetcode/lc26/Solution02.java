package geollan.leetcode.lc26;

/**
 * @Description 优雅双指针 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/7/19 9:26
 * @Author: Geollan
 **/
public class Solution02 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }

        return j + 1;
    }
}
