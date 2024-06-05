package geollan.leetcode.lc12;

/**
 * @Description 贪心算法 时间复杂度O(LogN) 空间复杂度O(LogN)
 * @Date: 2024/6/5 10:21
 * @Author: Geollan
 **/
public class Solution01 {
    public String intToRoman(int num) {
        int[] romanInt = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanStr = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int idx = 0;
        StringBuilder sb = new StringBuilder();

        while(idx < 13) {
            while(num >= romanInt[idx]) {
                num -= romanInt[idx];
                sb.append(romanStr[idx]);
            }

            idx++;
        }

        return sb.toString();
    }
}
