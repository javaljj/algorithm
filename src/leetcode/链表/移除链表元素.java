package leetcode.链表;

import publicnode.ListNode;

public class 移除链表元素 {

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        while (pre !=null && pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            }else {
                pre = pre.next;
            }
        }
        return dummy.next;
    }
}
