package main.org.offer.geollan.jz65;

/**
 * @Description 迭代 时间复杂度O(1) 空间复杂度O(1)
 * @Date: 2024/3/4 08:40
 * @Author: Geollan
 **/
public class Solution01 {
    public int Add(int num1, int num2) {
        while (num2 != 0) {
            int c = (num1 & num2) << 1;
            num1 ^= num2;
            num2 = c;
        }

        return num1;
    }
}
