package geollan.newcoder.jz18;

import main.org.offer.geollan.utils.ListNode;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/1/24 21:24
 * @Author: Geollan
 **/
public class Solution01 {

    public ListNode deleteNode(ListNode head, int val) {
        // write code here
        // 定义一个头节点，方便删除
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            }

            prev = prev.next;
        }
        return dummy.next;
    }
}
