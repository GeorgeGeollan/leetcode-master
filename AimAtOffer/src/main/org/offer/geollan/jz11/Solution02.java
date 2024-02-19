package main.org.offer.geollan.jz11;

/**
 * @Description 迭代/二分查找 时间复杂度O(logN) 空间复杂度O(1)
 * @Date: 2024/2/19 09:06
 * @Author: Geollan
 **/
public class Solution02 {
    public int minNumberInRotateArray(int[] nums) {
        // write code here
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right])
                left = mid + 1;
            else if (nums[mid] < nums[right])
                right = mid;
            else
                right--;
        }

        return nums[left];
    }
}
