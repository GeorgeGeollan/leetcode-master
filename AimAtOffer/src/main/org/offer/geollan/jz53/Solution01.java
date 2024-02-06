package main.org.offer.geollan.jz53;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/2/6 23:42
 * @Author: Geollan
 **/
public class Solution01 {
    public int GetNumberOfK(int[] nums, int k) {
        // write code here
        int cnt = 0;

        for (int num : nums) {
            if (num == k)
                cnt++;

            if (cnt != 0 && num != k)
                break;
        }

        return cnt;
    }
}
