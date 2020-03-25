package jzoffer;

import publicnode.ListNode;

public class 合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode pre = new ListNode(-1);
        ListNode curr = pre;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                if (pre.next == null) {
                    pre.next = l2;
                    curr = l2;
                } else {
                    curr.next = l2;
                    curr = l2;
                }
                l2 = l2.next;
            } else {
                if (pre.next == null) {
                    pre.next = l1;
                    curr = l1;
                } else {
                    curr.next = l1;
                    curr = l1;
                }
                l1 = l1.next;
            }
        }

        if (l1 == null){
            curr.next = l2;
        }else{
            curr.next = l1;
        }


            return pre.next;
    }
}
