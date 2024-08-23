package geollan.leetcode.lc300_399.lc394;

import java.util.Stack;

/**
 * @Description
 * @Date: 2024/4/18 9:25
 * @Author: Geollan
 **/
public class Solution01 {
    class Solution {
        public String decodeString(String s) {
            Stack<Character> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            Stack<Integer> times = new Stack<>();
            Stack<String> ch = new Stack<>();
            int muti = 0;

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '[') {
                    times.push(muti);
                    ch.push(sb.toString());
                    muti = 0;
                    sb = new StringBuilder();
                }

                else if(s.charAt(i) == ']') {
                    StringBuilder temp = new StringBuilder();
                    int time = times.pop();
                    for(int j = 0; j < time; j++) temp.append(sb);
                    sb = new StringBuilder(ch.pop() + temp);
                }

                else if(s.charAt(i) >= '0' && s.charAt(i) <= '9') muti = muti * 10 + Integer.parseInt(s.charAt(i) + "");
                else sb.append(s.charAt(i));
            }

            return sb.toString();
        }
    }
}
