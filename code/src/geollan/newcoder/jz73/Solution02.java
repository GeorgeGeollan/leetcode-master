package geollan.newcoder.jz73;

import java.util.Stack;

/**
 * @Description 迭代/栈 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/2/17 22:11
 * @Author: Geollan
 **/
public class Solution02 {
    public String ReverseSentence(String str) {
        StringBuilder sb = new StringBuilder();
        String[] words = str.split(" ");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < words.length; i++) {
            stack.push(words[i]);
            stack.push(" ");
        }

        if (!stack.isEmpty())
            stack.pop();

        while (!stack.isEmpty())
            sb.append(stack.pop());

        return sb.toString();
    }
}
