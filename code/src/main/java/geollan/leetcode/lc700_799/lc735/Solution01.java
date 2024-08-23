package geollan.leetcode.lc700_799.lc735;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Description 栈 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/4/17 8:53
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> d = new ArrayDeque<>();

        for(int asteroid: asteroids) {
            boolean ok = true;

            while(ok && !d.isEmpty() && d.peekLast() > 0 && asteroid < 0) {
                int a = d.peekLast(), b = -asteroid;
                if(a <= b) d.pollLast();
                if(a >= b) ok = false;
            }

            if(ok) d.addLast(asteroid);
        }

        int n = d.size();
        int[] ans = new int[n];

        while(!d.isEmpty()) ans[--n] = d.pollLast();

        return ans;
    }
}
