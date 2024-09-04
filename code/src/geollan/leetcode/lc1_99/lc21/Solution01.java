package geollan.leetcode.lc1_99.lc21;

import geollan.utils.ListNode;

/**
 * @Description 时间复杂度O(M+N) 空间复杂度O(1)
 * @Date: 2024/7/6 14:14
 * @Author: Geollan
 **/
public class Solution01 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode();
            ListNode head = dummy;

            while(list1 != null && list2 != null) {
                if(list1.val < list2.val) {
                    dummy.next = list1;
                    list1 = list1.next;
                }

                else {
                    dummy.next = list2;
                    list2 = list2.next;
                }

                dummy = dummy.next;
            }

            dummy.next = list1 == null ? list2 : list1;

            return head.next;
        }
    }
}
