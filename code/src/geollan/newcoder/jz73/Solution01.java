package geollan.newcoder.jz73;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/17 18:06
 * @Author: Geollan
 **/
public class Solution01 {
    public String ReverseSentence(String str) {
        StringBuilder sb = new StringBuilder();
        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}
