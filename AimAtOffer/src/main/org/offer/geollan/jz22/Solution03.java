package main.org.offer.geollan.jz22;

import main.org.offer.geollan.utils.ListNode;

/**
 * @Description 迭代/双指针 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/1/23 13:28
 * @Author: Geollan
 **/
public class Solution03 {
    public ListNode FindKthToTail(ListNode pHead, int k) {
        ListNode slow = pHead;
        ListNode fast = pHead;

        // 定义两个指针，让快指针先走k步
        for (int i = 0; i < k; i++) {
            if (fast == null)
                return null;
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
