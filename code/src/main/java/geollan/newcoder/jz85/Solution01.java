package geollan.newcoder.jz85;

/**
 * @Description 迭代 考虑多情况 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/2/23 09:04
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] FindGreatestSumOfSubArray(int[] array) {
        // write code here
        int start = 0, end = 0, n = array.length;
        int sum = 0, maxSum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
            if (sum < 0) {
                start = i + 1;
                sum = 0;
            }

            else if (sum >= maxSum) {
                maxSum = sum;
                end = i;
            }
        }

        int max = array[0], idx = 0;
        if (start > end) {
            for (int i = 1; i < n; i++) {
                if (max < array[i]) {
                    max = array[i];
                    idx = i;
                }
            }

            return new int[] {array[idx]};
        }
        int[] res = new int[end - start + 1];
        int cnt = 0;
        for (int i = start; i <= end; i++) {
            res[cnt++] = array[i];
        }

        return res;
    }
}
