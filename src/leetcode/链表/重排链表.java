package leetcode.链表;

import publicnode.ListNode;

public class 重排链表 {
    public void reorderList(ListNode head) {
        //双指正法
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        //倒排后半部分连表

        ListNode last = head;
        len = len / 2 + 1;
        while (len > 0) {
            len--;
            last = last.next;
        }

        ListNode listNode = reverseList(last);



    }

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
