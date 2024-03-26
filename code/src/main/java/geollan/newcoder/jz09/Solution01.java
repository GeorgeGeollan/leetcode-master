package geollan.newcoder.jz09;

import java.util.Stack;

/**
 * @Description 两个栈实现队列/存储空间复杂度为 O(n) 插入与删除的时间复杂度O(1)
 * @Date: 2024/2/14 17:08
 * @Author: Geollan
 **/
public class Solution01 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty() && stack1.isEmpty())
            return -1;

        if (stack2.isEmpty() && !stack1.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }

        return stack2.pop();
    }
}
