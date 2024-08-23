package geollan.leetcode.lc2000_2099.lc2095;

import geollan.utils.ListNode;

/**
 * @Description 快慢指针 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/24 9:04
 * @Author: Geollan
 **/
public class Solution01 {
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = head;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = new ListNode(0);
        prev.next = head;

        while(head != slow) {
            prev = head;
            head = head.next;
        }

        prev.next = prev.next.next;
        System.out.println(prev.val);

        return prev.val == 0 ? null : dummy;
    }
}
