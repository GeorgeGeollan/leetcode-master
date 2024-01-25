package main.org.offer.geollan.jz76;

import main.org.offer.geollan.utils.ListNode;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/1/25 14:35
 * @Author: Geollan
 **/
public class Solution02 {

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null)
            return null;

        ListNode dummy = new ListNode(pHead.val - 1);
        dummy.next = pHead;
        ListNode prev = dummy, cur = pHead;

        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }

            if (prev.next == cur) {
                prev = prev.next;
            }

            else {
                prev.next = cur.next;
            }

            cur = cur.next;
        }

        return dummy.next;
    }
}
