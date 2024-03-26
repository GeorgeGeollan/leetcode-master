package geollan.newcoder.jz22;

import geollan.newcoder.utils.ListNode;

/**
 * @Description 迭代/两次遍历 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/1/23 13:24
 * @Author: Geollan
 **/
public class Solution02 {
    public ListNode FindKthToTail(ListNode pHead, int k) {
        int len = 0;
        ListNode tmp = pHead;
        while (tmp != null) {
            tmp = tmp.next;
            len++;
        }

        if (k <= 0 || k > len) {
            return null;
        }

        for (int i = 0; i < len - k; i++) {
            pHead = pHead.next;
        }

        return pHead;
    }
}
