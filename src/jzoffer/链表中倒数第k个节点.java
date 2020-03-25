package jzoffer;

import publicnode.ListNode;

public class 链表中倒数第k个节点 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode kStep = head;
        ListNode slowStep = head;

        while (kStep != null) {
            if (k < 0) {
                slowStep = slowStep.next;
            }
            k--;
            kStep = kStep.next;
        }

        return slowStep;
    }
}
