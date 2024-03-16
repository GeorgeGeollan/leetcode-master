package main.org.offer.geollan.jz45;

import java.util.Arrays;

/**
 * @Description 迭代/字符串合并比较 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/3/16 18:35
 * @Author: Geollan
 **/
public class Solution01 {
    public String PrintMinNumber(int[] numbers) {
        // write code here
        String[] strs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strs, (a, b) -> (a + b).compareTo(b + a));

        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }

        return sb.toString();
    }
}
