package geollan.newcoder.jz03;

import java.util.Arrays;

/**
 * @Description 排序+指针前后判断 时间复杂度O(n) 空间复杂度O(1)
 * @Date: 2024/1/5 12:04
 * @Author: Geollan
 **/
public class Solution02 {
    /**
     * 
     * @param numbers
     * @return int
     */
    public int duplicate(int[] numbers) {
        // 简单的判断，若数组为空或长度为零，直接返回
        if (numbers == null || numbers.length == 0) {
            return -1;
        }

        // 对numbers进行排序
        Arrays.sort(numbers);
        int prev = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == prev) {
                return prev;
            }

            prev = numbers[i];
        }

        return -1;
    }
}
