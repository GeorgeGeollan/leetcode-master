package geollan.leetcode.lc2130;

import geollan.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 额外数组法 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/4/28 8:59
 * @Author: Geollan
 **/
public class Solution01 {
    public int pairSum(ListNode head) {
        List<Integer> num = new ArrayList<>();
        int max = 0;

        while(head != null) {
            num.add(head.val);
            head = head.next;
        }

        for(int i = 0; i < num.size() / 2; i++) {
            max = Math.max(max, num.get(i) + num.get(num.size() - 1 - i));
        }

        return max;
    }
}
