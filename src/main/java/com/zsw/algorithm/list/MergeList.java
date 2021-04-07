package com.zsw.algorithm.list;

import com.zsw.algorithm.ListNode;

/**
 * 合并有序链表
 * @author zsw
 *
 */
public class MergeList {

	/**
	 * 递归版
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) return l2;
	    if (l2 == null) return l1;

	    if (l1.val < l2.val) {
	    	l1.next = mergeTwoLists(l1.next, l2);
	        return l1;
	    } else {
	        l2.next = mergeTwoLists(l1, l2.next);
	        return l2;
	    }
	}
	
	/**
	 * 非递归版
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		if (l1 == null) return l2;
	    if (l2 == null) return l1;
	    
	    ListNode newHead = new ListNode(-1);
	    ListNode p = newHead;
	    while (l1 != null && l2 != null) {
	    	if (l1.val < l2.val) {
	    		p.next = l1;
	    		l1 = l1.next;
	    	} else {
	    		p.next = l2;
	    		l2 = l2.next;
	    	}
	    	p = p.next;
	    }
	    
	    if (l1 != null) {
	    	p.next = l1;
	    }
	    if (l2 != null) {
	    	p.next = l2;
	    }
	    return newHead.next;
	}
}
