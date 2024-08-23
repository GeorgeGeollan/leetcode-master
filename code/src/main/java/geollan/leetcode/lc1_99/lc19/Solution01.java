package geollan.leetcode.lc1_99.lc19;

import geollan.utils.ListNode;

/**
 * @Description 笨办法 先算链表长度再到指定位置中断 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/7/9 14:23
 * @Author: Geollan
 **/
public class Solution01 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode temp = dummy;
        int sz = 0;
        while(temp != null) {
            sz++;
            temp = temp.next;
        }

        temp = dummy;
        sz = sz - n;
        while(temp != null) {
            sz--;

            if(sz == 0) {
                temp.next = temp.next.next;
            }

            temp = temp.next;
        }

        return dummy.next;
    }
}
