package geollan.leetcode.lc300_399.lc345;

/**
 * @Description 双指针 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/3/28 22:30
 * @Author: Geollan
 **/
public class Solution01 {
    public String reverseVowels(String s) {
        char[] letter = s.toCharArray();

        int left = 0, right = s.length() - 1;

        while(left <= right) {
            while(left <= right && letter[left] != 'a' && letter[left] != 'e' && letter[left] != 'i' && letter[left] != 'o' && letter[left] != 'u'
                && letter[left] != 'A' && letter[left] != 'E' && letter[left] != 'I' && letter[left] != 'O' && letter[left] != 'U') left++;

            while(left <= right && letter[right] != 'a' && letter[right] != 'e' && letter[right] != 'i' && letter[right] != 'o' && letter[right] != 'u'
                && letter[right] != 'A' && letter[right] != 'E' && letter[right] != 'I' && letter[right] != 'O' && letter[right] != 'U') right--;

            if(left > right) break;
            char temp = letter[left];
            letter[left] = letter[right];
            letter[right] = temp;
            left++;
            right--;
        }

        return new String(letter);
    }
}
