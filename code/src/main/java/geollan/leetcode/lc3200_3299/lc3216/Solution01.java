package geollan.leetcode.lc3200_3299.lc3216;

/**
 * @Description
 * @Date: 2024/7/15 11:00
 * @Author: Geollan
 **/
public class Solution01 {
    public String getSmallestString(String s) {
        char[] nums = s.toCharArray();
        for(int i = 0; i < s.length() - 1; i++) {
            if(Integer.valueOf(nums[i]) % 2 == Integer.valueOf(nums[i + 1]) % 2 && nums[i] > nums[i + 1]) {
                char temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                break;
            }
        }

        return new String(nums);
    }
}
