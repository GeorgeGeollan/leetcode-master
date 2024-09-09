package geollan.leetcode.lc2100_2199.lc2181;

import geollan.utils.ListNode;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/9/9 9:03
 * @Author: Geollan
 **/
public class Solution01 {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode ptr = dummy;
        int sign = -1;

        while(head != null) {
            int cur = 0;
            if(head.val == 0) {
                head = head.next;
                while(head != null && head.val != 0) {
                    cur += head.val;
                    head = head.next;
                }

                if(cur == 0) continue;
                ptr.next = new ListNode(cur);
                ptr = ptr.next;
            }
        }

        return dummy.next;
    }
}
