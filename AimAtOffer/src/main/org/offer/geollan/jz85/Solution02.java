package main.org.offer.geollan.jz85;

/**
 * @Description 迭代 优化之前代码 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/2/23 10:35
 * @Author: Geollan
 **/
public class Solution02 {
    public int[] FindGreatestSumOfSubArray(int[] array) {
        // write code here
        int start = 0, end = 0, n = array.length;
        int sum = array[0], max = array[0], temp = 0;
        for (int i = 1; i < n; i++) {
            if (sum + array[i] >= array[i]) {
                sum += array[i];
            }

            else {
                sum = array[i];
                temp = i;
            }

            if (sum >= max) {
                max = sum;
                end = i;
                start = temp;
            }
        }

        int[] res = new int[end - start + 1];
        int cnt = 0;
        for (int i = start; i <= end; i++) {
            res[cnt++] = array[i];
        }

        return res;
    }
}
