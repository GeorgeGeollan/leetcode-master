package geollan.newcoder.jz39;

/**
 * @Description 迭代/众数 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/2/28 21:32
 * @Author: Geollan
 **/
public class Solution02 {
    public int MoreThanHalfNum_Solution(int[] numbers) {
        // write code here
        int fre = numbers[0];
        int cnt = 0;
        for (int num : numbers) {
            if (num == fre)
                cnt++;
            else {
                cnt--;
                if (cnt < 0) {
                    fre = num;
                    cnt = 0;
                }
            }
        }

        return fre;
    }
}
