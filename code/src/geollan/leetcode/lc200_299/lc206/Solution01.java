package geollan.leetcode.lc200_299.lc206;

import geollan.utils.ListNode;

/**
 * @Description 定义一个指针，从头开始反转 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/26 9:02
 * @Author: Geollan
 **/
public class Solution01 {
    public ListNode reverseList(ListNode head) {
        ListNode ptr = null;
        ListNode prev = null;

        while(head != null) {
            prev = head;
            ListNode tmp = head.next;
            head.next = ptr;
            ptr = head;
            head = tmp;
        }

        return prev;
    }
}
