package geollan.newcoder.jz61;

import java.util.Arrays;

/**
 * @Description 迭代 时间复杂度O(logN) 空间复杂度O(1)
 * @Date: 2024/3/10 15:52
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean IsContinuous(int[] numbers) {
        // write code here
        int numOfZeros = 0;
        int n = numbers.length;

        for (int num : numbers) {
            if (num == 0)
                numOfZeros++;
        }

        Arrays.sort(numbers);
        if (numbers[n - 1] - numbers[numOfZeros] + 1 > n)
            return false;

        for (int i = numOfZeros; i < n - 1; i++) {
            if (numbers[i] == numbers[i + 1])
                return false;
        }

        return true;
    }
}
