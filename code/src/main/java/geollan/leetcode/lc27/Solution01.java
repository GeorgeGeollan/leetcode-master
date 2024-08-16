package geollan.leetcode.lc27;

/**
 * @Description
 * @Date: 2024/8/16 9:56
 * @Author: Geollan
 **/
public class Solution01 {
    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length - 1;
        int cnt = 0;

        while(l <= r) {
            while(l < r && nums[l] != val) l++;
            while(r >= 0 && nums[r] == val) r--;
            if(l > r) break;
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
            cnt++;

        }

        return l;
    }
}
