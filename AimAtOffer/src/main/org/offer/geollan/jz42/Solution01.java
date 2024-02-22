package main.org.offer.geollan.jz42;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/2/22 08:56
 * @Author: Geollan
 **/
public class Solution01 {
    public int FindGreatestSumOfSubArray(int[] array) {
        // write code here
        int sum = array[0];
        int n = array.length, maxSum = sum;

        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + array[i], array[i]);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
