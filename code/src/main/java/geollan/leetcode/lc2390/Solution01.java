package geollan.leetcode.lc2390;

import java.util.Stack;

/**
 * @Description 堆+StringBuilder 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/4/16 8:57
 * @Author: Geollan
 **/
public class Solution01 {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') stack.pop();
            else stack.push(s.charAt(i));
        }

        int n = stack.size();

        for(int i = 0; i < n; i++) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
