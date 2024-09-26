package geollan.leetcode.lc2500_2599.lc2535;

/**
 * @Description 时间复杂度O(NlogM) 空间复杂度O(1)
 * @Date: 2024/9/26 9:08
 * @Author: Geollan
 **/
public class Solution01 {
    public int differenceOfSum(int[] nums) {
        int sumTotal = 0;
        int sumDigit = 0;

        for(int num: nums) {
            sumTotal += num;
            sumDigit += getDigitSum(num);

        }

        return Math.abs(sumTotal - sumDigit);
    }

    public int getDigitSum(int num) {
        int sum = 0;

        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
