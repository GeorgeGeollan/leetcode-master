package geollan.leetcode.lc16;

import java.util.Stack;

/**
 * @Description 堆 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/6/17 9:32
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] words = s.toCharArray();

        for(char word: words) {
            if(word == ']' || word == '}' || word == ')') {
                if(stack.isEmpty()) return false;
                else if(word == ']' && stack.peek() == '[') stack.pop();
                else if(word == ')' && stack.peek() == '(') stack.pop();
                else if(word == '}' && stack.peek() == '{') stack.pop();
                else return false;
            }

            else stack.push(word);
        }

        return stack.isEmpty();
    }
}
