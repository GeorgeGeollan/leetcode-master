package main.org.offer.geollan.jz22;

import java.util.ArrayList;

import main.org.offer.geollan.utils.ListNode;

/**
 * @Description 迭代/额外空间记录元素 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/1/23 10:00
 * @Author: Geollan
 **/
public class Solution01 {
    public ListNode FindKthToTail(ListNode pHead, int k) {
        // write code here
        ArrayList<ListNode> arr = new ArrayList<>();
        while (pHead != null) {
            arr.add(pHead);
            pHead = pHead.next;
        }

        if (k <= 0 || arr.size() < k)
            return null;

        return arr.get(arr.size() - k);
    }
}
