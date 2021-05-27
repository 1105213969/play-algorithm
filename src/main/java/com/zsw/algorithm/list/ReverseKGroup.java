package com.zsw.algorithm.list;

import com.zsw.ListNode;

/**
 * k个一组翻转链表
 */
public class ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null) {
            ListNode start = head;
            ListNode end = head;
            int i = 0;
            while (i < k-1 && end != null) {
                i++;
                end = end.next;
            }
            if (end == null) {
                break;
            }
            ListNode next = end.next;
            end.next = null;
            pre.next = reverse(start);
            start.next = next;
            pre = start;
            head = next;
        }
        return dummy.next;
    }

    ListNode reverse(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = dummy.next;
            dummy.next = head;
            head = tmp;
        }
        return dummy.next;
    }
}
