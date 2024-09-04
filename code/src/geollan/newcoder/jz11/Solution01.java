package geollan.newcoder.jz11;

/**
 * @Description 迭代/从头遍历 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/2/19 08:59
 * @Author: Geollan
 **/
public class Solution01 {
    public int minNumberInRotateArray(int[] nums) {
        // write code here
        int min = 10001;

        for (int num : nums) {
            if (min > num)
                min = num;
        }

        return min;
    }
}
