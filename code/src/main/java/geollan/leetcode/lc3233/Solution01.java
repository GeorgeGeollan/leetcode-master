package geollan.leetcode.lc3233;

/**
 * @Description 时间复杂度O(1) 空间复杂度O(1)
 * @Date: 2024/7/31 11:11
 * @Author: Geollan
 **/
public class Solution01 {
    private static final int MX = 31622;
    private static final int[] PI = new int[MX + 1];

    static {
        for(int i = 2; i <= MX; i++) {
            if(PI[i] == 0) {
                PI[i] = PI[i - 1] + 1;
                for(int j = i * i; j <= MX; j += i) {
                    PI[j] = -1;
                }
            }

            else PI[i] = PI[i - 1];
        }
    }
    public int nonSpecialCount(int l, int r) {
        return r - l + 1 - (PI[(int) Math.sqrt(r)] - PI[(int) Math.sqrt(l - 1)]);
    }
}
