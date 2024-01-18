package main.org.offer.geollan.jz25;

/**
 * @Description 迭代法 时间复杂度O(M+N) 空间复杂度O(1)
 * @Date: 2024/1/18 10:21
 * @Author: Geollan
 **/
public class Solution01 {
    class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode pHead1, ListNode pHead2) {
        ListNode head = new ListNode(0);
        ListNode prev = head;
        while (pHead1 != null && pHead2 != null) {
            if (pHead1.val < pHead2.val) {
                prev.next = pHead1;
                prev = prev.next;
                pHead1 = pHead1.next;
            }

            else {
                prev.next = pHead2;
                prev = prev.next;
                pHead2 = pHead2.next;
            }
        }

        prev.next = pHead1 == null ? pHead2 : pHead1;

        return head.next;
    }
}
