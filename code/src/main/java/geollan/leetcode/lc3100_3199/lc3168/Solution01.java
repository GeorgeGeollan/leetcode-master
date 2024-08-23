package geollan.leetcode.lc3100_3199.lc3168;

import java.util.Stack;

/**
 * @Description 栈 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/6/7 9:58
 * @Author: Geollan
 **/
public class Solution01 {
    class Solution {
        public int minimumChairs(String s) {
            Stack<Character> stack = new Stack<>();
            int max = 0;

            for(int i = 0; i < s.length(); i++) {
                if(stack.isEmpty()) stack.push(s.charAt(i));

                else {
                    if(stack.peek() == 'E' && s.charAt(i) == 'L') stack.pop();
                    else stack.push(s.charAt(i));
                }

                max = Math.max(max, stack.size());
            }

            return max;
        }
    }
}
