package main.org.offer.geollan.jz30;

import java.util.Stack;

/**
 * @Description 迭代 时间复杂度O(1) 空间复杂度O(N)
 * @Date: 2024/2/15 13:21
 * @Author: Geollan
 **/
public class Solution01 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);

        if (stack2.isEmpty())
            stack2.push(node);
        else {
            if (stack2.peek() > node)
                stack2.push(node);
            else
                stack2.push(stack2.peek());
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
