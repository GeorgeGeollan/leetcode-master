package main.org.offer.geollan.jz65;

/**
 * @Description 递归 时间复杂度O(1) 空间复杂度O(1)
 * @Date: 2024/3/4 11:13
 * @Author: Geollan
 **/
public class Solution02 {
    public int Add(int num1, int num2) {
        if (num2 == 0)
            return num1;

        return Add(num1 ^ num2, (num1 & num2) << 1);
    }
}
