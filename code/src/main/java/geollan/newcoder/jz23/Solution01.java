package geollan.newcoder.jz23;

import geollan.newcoder.utils.ListNode;

import java.util.HashSet;

/**
 * @Description 迭代+Set 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/1/21 22:59
 * @Author: Geollan
 **/
public class Solution01 {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        HashSet<ListNode> visited = new HashSet<>();

        while (pHead != null) {
            if (visited.contains(pHead)) {
                return pHead;
            }

            else {
                visited.add(pHead);
            }

            pHead = pHead.next;
        }

        return null;
    }
}
