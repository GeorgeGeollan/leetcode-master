package main.org.offer.geollan.jz52;

import main.org.offer.geollan.utils.ListNode;

/**
 * @Description 迭代法 时间复杂度O(M+N) 空间复杂度O(1)/简洁版本
 * @Date: 2024/1/20 11:25
 * @Author: Geollan
 **/
public class Solution02 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode A = pHead1;
        ListNode B = pHead2;

        while (A != B) {
            A = A == null ? pHead2 : A.next;
            B = B == null ? pHead1 : B.next;
        }

        return A;
    }
}
