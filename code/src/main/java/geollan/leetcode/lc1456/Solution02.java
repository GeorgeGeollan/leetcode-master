package geollan.leetcode.lc1456;

/**
 * @Description 不用hashSet 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/7 10:38
 * @Author: Geollan
 **/
public class Solution02 {
    public int maxVowels(String s, int k) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < s.length(); ) {
            sum += isVowel(s.charAt(i));
            i++;
            if(i >= k) {
                maxSum = Math.max(sum, maxSum);
                sum -= isVowel(s.charAt(i - k));
            }
        }

        return maxSum;
    }

    public int isVowel(Character ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ? 1 : 0;
    }
}
