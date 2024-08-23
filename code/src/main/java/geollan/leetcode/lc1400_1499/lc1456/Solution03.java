package geollan.leetcode.lc1400_1499.lc1456;

/**
 * @Description 继续改进版本 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/7 10:43
 * @Author: Geollan
 **/
public class Solution03 {
    public int maxVowels(String s, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += isVowel(s.charAt(i));
        }

        int maxSum = sum;

        for(int i = k; i < s.length(); i++) {
            sum += isVowel(s.charAt(i)) - isVowel(s.charAt(i - k));
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public int isVowel(Character ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ? 1 : 0;
    }
}
