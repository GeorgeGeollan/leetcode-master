package geollan.newcoder.jz61;

import java.util.Arrays;

/**
 * @Description 迭代 时间复杂度O(logN) 空间复杂度O(1)
 * @Date: 2024/3/10 15:55
 * @Author: Geollan
 **/
public class Solution02 {
    public boolean IsContinuous(int[] numbers) {
        // write code here
        int numOfZeros = 0;
        Arrays.sort(numbers);

        for (int i = 0; i < 4; i++) {
            if (numbers[i] == 0)
                numOfZeros++;
            else if (numbers[i] == numbers[i + 1])
                return false;
        }

        return numbers[4] - numbers[numOfZeros] + 1 <= 5;
    }
}
