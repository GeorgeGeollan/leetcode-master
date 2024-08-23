package geollan.leetcode.lc3200_3299.lc3226;

/**
 * @Description 位运算 时间复杂度O(1) 空间复杂度O(1)
 * @Date: 2024/7/23 14:50
 * @Author: Geollan
 **/
public class Solution01 {
    public int minChanges(int n, int k) {
        return (n & k) != k ? -1 : Integer.bitCount(n ^ k);
    }
}
