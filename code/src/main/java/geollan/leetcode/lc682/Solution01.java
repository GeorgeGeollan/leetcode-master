package geollan.leetcode.lc682;

import java.util.Stack;

/**
 * @Description 栈 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/7/29 9:12
 * @Author: Geollan
 **/
public class Solution01 {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for(String op: operations) {
            System.out.println(stack);
            if(op.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                int c = a + b;
                stack.push(b);
                stack.push(a);
                stack.push(c);
            }

            else if(op.equals("D")) {
                int a = stack.peek();
                int b = a * 2;
                stack.push(b);
            }

            else if(op.equals("C")) stack.pop();

            else stack.push(Integer.valueOf(op));
        }

        while(!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}
