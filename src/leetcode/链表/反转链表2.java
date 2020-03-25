package leetcode.链表;

import publicnode.BulidList;
import publicnode.ListNode;

public class 反转链表2 {

    public static void main(String[] args) {
        reverseBetween(BulidList.getLIst(6), 2, 4);
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {

        int index = 1;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = head;
        ListNode pre = dummy;
        ListNode firstNode = null;
        while (curr != null) {

            if (index == m - 1) {
                pre = curr;
            }
            if (index == m) {
                firstNode = curr;
            }
            while (index >= m && index < n) {
                ListNode tmp = firstNode.next;
                //交换
                firstNode.next = tmp.next;
                tmp.next = pre.next;
                pre.next = tmp;
                index++;
            }

            index++;
            curr = curr.next;
        }


        return dummy.next;
    }
}
