package leetcode.链表;

import publicnode.ListNode;

public class 环形链表2 {

    public static void main(String[] args) {
        detectCycle(new ListNode(1));
    }

    public static ListNode detectCycle(ListNode head) {
        //先用快慢指针找到一个相遇的点
        ListNode fast = head;
        ListNode slow = head;
        boolean iscircle = false;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                iscircle = true;
                break;
            }
        }
        if (!iscircle) {
            return new ListNode(-1);
        }
        slow = head;

        while (true) {
            if (slow == fast) {
                return slow;
            }
            slow = slow.next;
            fast = fast.next;
        }

    }
}
