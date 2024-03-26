package geollan.newcoder.jz15;

/**
 * @Description 迭代 时间复杂度O(M) 空间复杂度O(1) M是1的个数
 * @Date: 2024/3/5 09:38
 * @Author: Geollan
 **/
public class Solution03 {
    public int NumberOf1(int n) {
        // write code here
        int cnt = 0;

        while (n != 0) {
            cnt++;
            n &= (n - 1);
        }

        return cnt;
    }
}
