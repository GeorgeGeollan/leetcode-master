package main.org.offer.geollan.jz52;

import main.org.offer.geollan.utils.ListNode;

/**
 * @Description 迭代法 时间复杂度O(M+N) 空间复杂度O(1)/啰嗦版本
 * @Date: 2024/1/20 10:17
 * @Author: Geollan
 **/
public class Solution01 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == pHead2) {
            return pHead1;
        }

        if (pHead1 == null || pHead2 == null) {
            return null;
        }

        ListNode ptr1 = pHead1;
        ListNode ptr2 = pHead2;

        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

            if (ptr1 == ptr2) {
                return ptr1;
            }

            if (ptr1 == null) {
                ptr1 = pHead2;
            }

            if (ptr2 == null) {
                ptr2 = pHead1;
            }
        }

        return ptr1;
    }
}
