package geollan.leetcode.lc300_399.lc328;

import geollan.utils.ListNode;

/**
 * @Description
 * @Date: 2024/4/25 9:12
 * @Author: Geollan
 **/
public class Solution01 {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode();
        ListNode ptr1 = odd;
        ListNode even = new ListNode();
        ListNode ptr2 = even;
        int cnt = 1;

        while(head != null) {
            if(cnt % 2 == 0) {
                even.next = head;
                even = even.next;
            }

            else {
                odd.next = head;
                odd = odd.next;
            }

            cnt++;
            head = head.next;
        }

        if(even.next != null) even.next = even.next.next;

        if(odd.next != null) odd.next = odd.next.next;

        odd.next = ptr2.next;

        return ptr1.next;
    }
}
