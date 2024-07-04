package geollan.leetcode.lc167;

/**
 * @Description 双指针 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/7/4 10:07
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int l = 0, r = numbers.length - 1;

        while(l < r) {
            int sum = numbers[l] + numbers[r];
            if(sum == target) {
                ans[0] = l + 1;
                ans[1] = r + 1;
                break;
            }

            if(sum > target) r--;
            else if(sum < target) l++;
        }

        return ans;
    }
}
