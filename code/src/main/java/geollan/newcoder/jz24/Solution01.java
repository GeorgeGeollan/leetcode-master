package geollan.newcoder.jz24;

import geollan.newcoder.utils.ListNode;

/**
 * @Description 迭代法，双指针 时间复杂度O(n) 空间复杂度O(1)
 * @Date: 2024/1/16 16:27
 * @Author: Geollan
 **/

public class Solution01 {
    public ListNode ReverseList(ListNode head) {
        // 记录当前节点的前一个节点
        ListNode prev = null;

        while (head != null) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }

        return prev;
    }
}
