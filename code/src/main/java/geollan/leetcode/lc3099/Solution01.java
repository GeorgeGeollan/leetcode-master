package geollan.leetcode.lc3099;

/**
 * @Description 时间复杂度O(logN) 空间复杂度O(1)
 * @Date: 2024/7/3 9:33
 * @Author: Geollan
 **/
public class Solution01 {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;

        int temp = x;
        while(temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return x % sum == 0 ? sum : -1;
    }
}
