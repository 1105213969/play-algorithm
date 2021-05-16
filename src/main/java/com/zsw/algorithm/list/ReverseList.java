package com.zsw.algorithm.list;

import com.zsw.ListNode;

/**
 * 翻转链表
 */
public class ReverseList {

    /**
     * 递归版
     * @param head
     * @return
     */
    public ListNode reverse(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    
    /**
     * 迭代版
     * @param head
     * @return
     */
    public ListNode reverse2(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = null;
        ListNode p = head, q = p.next;
        while (p != null) {
            p.next = dummy.next;
            dummy.next = p;
            p = q;
            if (q == null) break;
            q = q.next;
        }

        return dummy.next;
    }
}
