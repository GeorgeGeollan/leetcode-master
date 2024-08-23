package geollan.leetcode.lc3100_3199.lc3174;

import java.util.Stack;

/**
 * @Description 栈 + StringBuilder 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/6/12 10:32
 * @Author: Geollan
 **/
public class Solution01 {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for(char ch: chars) {
            if(Character.isDigit(ch)) stack.pop();
            else stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
