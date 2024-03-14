package main.org.offer.geollan.jz21;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/3/14 09:43
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] reOrderArray(int[] array) {
        // write code here
        int n = array.length, cnt = 0;
        int left = 0, right = 1;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            if ((array[i] & 1) == 1)
                res[cnt++] = array[i];
        }

        for (int i = 0; i < n; i++) {
            if ((array[i] & 1) == 0)
                res[cnt++] = array[i];
        }

        return res;
    }
}
