package geollan.newcoder.jz43;

/**
 * @Description 迭代 时间复杂度O(NM) 空间复杂度O(1)
 * @Date: 2024/3/15 09:56
 * @Author: Geollan
 **/
public class Solution01 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            cnt += findNumberOfOne(i);
        }

        return cnt;
    }

    public int findNumberOfOne(int n) {
        int cnt = 0;
        while (n > 0) {
            int cur = n % 10;
            if (cur == 1)
                cnt++;
            n = n / 10;
        }

        return cnt;
    }
}
