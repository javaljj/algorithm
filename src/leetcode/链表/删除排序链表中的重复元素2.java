package leetcode.链表;

import publicnode.ListNode;

public class 删除排序链表中的重复元素2 {

    public static void main(String[] args) {


    }
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null) {
            int val = head.val;
            ListNode tmp = head;
            while (head != null && head.next != null && head.next.val == val) {
                head = head.next;
            }
            //说明有不同点
            if (tmp != head) {
                pre.next = head.next;
            } else {
                pre = head;
            }

            head = head.next;
        }
        return dummy.next;

    }

}
