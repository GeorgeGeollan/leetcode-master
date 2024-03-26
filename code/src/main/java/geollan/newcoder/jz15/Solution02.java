package geollan.newcoder.jz15;

/**
 * @Description 递归 时间复杂度O(logN) 空间复杂度O(1)
 * @Date: 2024/3/5 09:37
 * @Author: Geollan
 **/
public class Solution02 {
    public int NumberOf1(int n) {
        // write code here
        int cnt = 0;
        while (n != 0) {
            cnt += n & 1;
            n >>>= 1;
        }

        return cnt;
    }
}
