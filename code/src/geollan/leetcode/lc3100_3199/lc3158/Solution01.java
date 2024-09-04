package geollan.leetcode.lc3100_3199.lc3158;

/**
 * @Description 额外数组 多次遍历 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/6/19 10:04
 * @Author: Geollan
 **/
public class Solution01 {
    public int duplicateNumbersXOR(int[] nums) {
        int[] cnt = new int[51];

        for(int num: nums) {
            cnt[num]++;
        }

        int ans = 0;

        for(int num: nums) {
            if(cnt[num]-- == 2) ans ^= num;
        }

        return ans;
    }
}
