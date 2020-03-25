package leetcode.链表;

import publicnode.BulidList;
import publicnode.ListNode;

public class 分隔链表1 {
    public static void main(String[] args) {
        partition(BulidList.getLIst(new int[]{3,1,2}), 3);
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode first = null;
        ListNode second = dummy;

        while (second != null) {
            if (first == null && second.next != null  && second.next.val >= x) {
                first = second;
            } else if (first != null && second.next != null && second.next.val < x) {
                //交换 吧节点换出来
                ListNode tmp = second.next;
                second.next = tmp.next;
                tmp.next = first.next;
                first.next = tmp;
                first = tmp;
                continue;
            }
            second = second.next;
        }
        return dummy.next;
    }
}
