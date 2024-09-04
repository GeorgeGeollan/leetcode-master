package geollan.leetcode.lc3200_3299.lc3258;

/**
 * @Description 双指针 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/8/20 10:33
 * @Author: Geollan
 **/
public class Solution01 {
    public int countKConstraintSubstrings(String s, int k) {
        char[] letter = s.toCharArray();
        int ans = 0;
        int left = 0;
        int[] cnt = new int[2];

        for(int i = 0; i < letter.length; i++) {
            cnt[letter[i] & 1]++;

            while(cnt[0] > k && cnt[1] > k) {
                cnt[letter[left++] & 1]--;
            }

            ans += i - left + 1;
        }

        return ans;
    }
}
