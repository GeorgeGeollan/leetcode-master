package geollan.leetcode.lc3200_3299.lc3270;

/**
 * @Description 使用StringBuilder
 * @Date: 2025/1/11 13:23
 * @Author: Geollan
 **/
public class Solution01 {
    public int generateKey(int num1, int num2, int num3) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 4; i++) {
            int cur = Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10));
            num1 = num1 / 10;
            num2 = num2 / 10;
            num3 = num3 / 10;
            sb.append(cur);
        }

        return Integer.valueOf(sb.reverse().toString());
    }
}
