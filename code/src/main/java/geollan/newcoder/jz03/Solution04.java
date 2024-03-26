package geollan.newcoder.jz03;

/**
 * @Description 原地修改 时间复杂度O(n) 空间复杂度O(1)
 * @Date: 2024/1/5 14:26
 * @Author: Geollan
 **/

public class Solution04 {
    public int duplicate(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            if (numbers[i] != i) {
                int j = numbers[i];

                if (numbers[j] == numbers[i]) {
                    return numbers[j];
                }

                else {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }

            }
        }
        return -1;
    }
}
