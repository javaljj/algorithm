package leetcode.链表;

import publicnode.ListNode;

public class 反转链表 {
    public ListNode reverseList(ListNode head) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        while (head != null && head.next != null) {
            //交换
            ListNode changgeNode = head.next;

            head.next = changgeNode.next;
            changgeNode.next = dummy.next;
            dummy.next = changgeNode;
        }

        return dummy.next;

    }

}
