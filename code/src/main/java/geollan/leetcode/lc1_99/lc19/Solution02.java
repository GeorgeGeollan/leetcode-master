package geollan.leetcode.lc1_99.lc19;

import geollan.utils.ListNode;

/**
 * @Description 双指针 左右指针 右指针先走n步 时间复杂度O(N) 空间复杂度O(N)``````````````````````````````````
 * @Date: 2024/7/9 14:33
 * @Author: Geollan
 **/
public class Solution02 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode right = dummy;
        ListNode left = dummy;
        while(n-- > 0) {
            right = right.next;
        }

        while(right.next != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;

        return dummy.next;
    }
}
