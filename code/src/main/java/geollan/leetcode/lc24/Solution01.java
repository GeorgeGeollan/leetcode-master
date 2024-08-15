package geollan.leetcode.lc24;

import geollan.utils.ListNode;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/8/15 9:13
 * @Author: Geollan
 **/
public class Solution01 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        // 定义一个快慢指针
        ListNode fast = head.next;
        ListNode slow = head;
        ListNode temp = null;
        ListNode dummy = head.next;
        ListNode prev = new ListNode(0);

        while(fast != null && slow != null) {
            temp = fast.next;
            slow.next = temp;
            fast.next = slow;
            prev.next = fast;
            prev = slow;
            slow = temp;
            if(slow != null) fast = slow.next;
        }

        return dummy;
    }
}
