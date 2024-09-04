package geollan.newcoder.jz31;

import java.util.Stack;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/16 13:04
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean IsPopOrder(int[] pushV, int[] popV) {
        // write code here
        int cur = 0;
        Stack<Integer> stack = new Stack<>();

        for (int num : pushV) {
            stack.push(num);
            while (!stack.isEmpty() && popV[cur] == stack.peek()) {
                stack.pop();
                cur++;
            }
        }

        return stack.isEmpty();
    }
}
