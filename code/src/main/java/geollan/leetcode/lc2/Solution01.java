package geollan.leetcode.lc2;

import geollan.utils.ListNode;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/5/23 11:17
 * @Author: Geollan
 **/
public class Solution01 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int impr = 0;
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        while(l1 != null || l2 != null) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            int cur = (a + b + impr) % 10;
            impr = (a + b + impr) / 10;
            ans.next = new ListNode(cur);
            ans = ans.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(impr != 0) ans.next = new ListNode(impr);

        return dummy.next;
    }
}
