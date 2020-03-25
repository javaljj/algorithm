package jzoffer;

import publicnode.ListNode;

public class 反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = new ListNode(-1);

        while (head != null) {

            ListNode tmp = head;
            tmp.next = pre.next;
            pre.next = tmp;

            head = head.next;
        }
        return pre.next;

    }

}
