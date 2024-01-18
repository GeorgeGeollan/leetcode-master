package main.org.offer.geollan.jz25;

/**
 * @Description 递归 时间复杂度O(M+N) 空间复杂度O(M+N)
 * @Date: 2024/1/18 19:42
 * @Author: Geollan
 **/
public class Solution02 {
    class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null) {
            return pHead2;
        }

        if (pHead2 == null) {
            return pHead1;
        }

        if (pHead1.val <= pHead2.val) {
            pHead1.next = Merge(pHead1.next, pHead2);
            return pHead1;
        }

        else {
            pHead2.next = Merge(pHead1, pHead2.next);
            return pHead2;
        }
    }
}
