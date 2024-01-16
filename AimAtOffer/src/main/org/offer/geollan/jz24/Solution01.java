package main.org.offer.geollan.jz24;

/**
 * @Description
 * @Date: 2024/1/16 16:27
 * @Author: Geollan
 **/
class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}

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
