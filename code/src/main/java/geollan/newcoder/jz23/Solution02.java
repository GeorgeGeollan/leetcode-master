package geollan.newcoder.jz23;

import geollan.newcoder.utils.ListNode;

/**
 * @Description 迭代 快慢指针 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/1/22 00:42
 * @Author: Geollan
 **/
public class Solution02 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode slow = pHead;
        ListNode fast = pHead;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null)
            return null;
        fast = pHead;

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;

    }
}
