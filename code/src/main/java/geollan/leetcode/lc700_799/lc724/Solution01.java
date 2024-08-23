package geollan.leetcode.lc700_799.lc724;

/**
 * @Description
 * @Date: 2024/4/11 10:05
 * @Author: Geollan
 **/
public class Solution01 {
    public int pivotIndex(int[] nums) {
        int rightSum = 0, leftSum = 0, sum = 0, idx = -1;

        for(int num: nums) {
            sum += num;
        }

        rightSum = sum - leftSum;

        for(int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if(i != 0) leftSum += nums[i - 1];
            System.out.println(leftSum + " " +rightSum);
            if(rightSum == leftSum) return i;
        }

        return idx;
    }

    // 优化版本
    public int pivotIndexPlus(int[] nums) {
        int rightSum = 0, leftSum = 0, sum = 0, idx = -1;

        for(int num: nums) {
            sum += num;
        }

        rightSum = sum;

        for(int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if(rightSum == leftSum) return i;
            leftSum += nums[i];
        }

        return idx;
    }
}
