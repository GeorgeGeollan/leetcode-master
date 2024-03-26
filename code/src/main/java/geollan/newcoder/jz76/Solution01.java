package geollan.newcoder.jz76;

import geollan.newcoder.utils.ListNode;

/**
 * @Description 递归 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/1/25 10:24
 * @Author: Geollan
 **/
public class Solution01 {

    public ListNode deleteDuplication(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        if (head.val != head.next.val) {
            head.next = deleteDuplication(head.next);
        }

        else {
            ListNode move = head.next;

            while (move != null && head.val == move.val) {
                move = move.next;
            }

            return deleteDuplication(move);
        }

        return head;
    }
}