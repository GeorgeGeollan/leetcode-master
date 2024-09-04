package geollan.newcoder.jz39;

import java.util.HashMap;

/**
 * @Description 迭代/HashMap 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/28 21:29
 * @Author: Geollan
 **/
public class Solution01 {
    public int MoreThanHalfNum_Solution(int[] numbers) {
        // write code here
        HashMap<Integer, Integer> cnt = new HashMap<>();
        int n = numbers.length;

        for (int num : numbers) {
            if (cnt.getOrDefault(num, 0) >= n / 2)
                return num;
            else
                cnt.put(num, cnt.getOrDefault(num, 0) + 1);
        }

        return -1;
    }
}
