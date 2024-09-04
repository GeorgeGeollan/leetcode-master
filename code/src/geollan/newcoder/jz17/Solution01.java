package geollan.newcoder.jz17;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/3/1 23:41
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] printNumbers(int n) {
        // write code here
        int len = (int)(Math.pow(10, n));
        int[] arr = new int[len - 1];

        for (int i = 1; i < len; i++) {
            arr[i - 1] = i;
        }

        return arr;
    }
}
