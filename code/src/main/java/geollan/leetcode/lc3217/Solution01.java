package geollan.leetcode.lc3217;

import geollan.utils.ListNode;

import java.util.HashSet;

/**
 * @Description 哈希集合 前置指针 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/7/17 9:04
 * @Author: Geollan
 **/
public class Solution01 {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums) {
            set.add(num);
        }

        ListNode prev = dummy;
        while(head != null) {
            while(head != null && set.contains(head.val)) {
                head = head.next;
            }


            prev.next = head;
            prev = head;

            if(head == null) break;
            head = head.next;
        }

        return dummy.next;
    }
}
