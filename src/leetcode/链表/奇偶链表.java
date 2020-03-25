package leetcode.链表;

import publicnode.BulidList;
import publicnode.ListNode;

public class 奇偶链表 {
    public static void main(String[] args) {

        oddEvenList(BulidList.getLIst(new int[]{1, 2, 3, 4, 5}));
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        //双数指针
        ListNode oddhead = new ListNode(-1);
        //指向头结点
        oddhead.next = head;
        //移动的节点
        ListNode odd = oddhead.next;
        //单数指针
        ListNode evenhead = new ListNode(-1);
        //指向头结点
        evenhead.next = head.next;
        //移动的节点
        ListNode even = evenhead.next;
        // 第单数节点的位置
        ListNode curr = head.next;
        while (curr != null) {
            //往后走一步
            curr = curr.next;
            //
            ListNode sig = curr;
            curr = curr == null ? null : curr.next;
            ListNode dbl = curr;
            if (sig != null) {
                odd.next = sig;
                odd = sig;
                odd.next = null;
            }
            if (dbl != null) {
                even.next = dbl;
                even = dbl;
            }
        }
        even.next = null;
        odd.next = null;
        odd.next = evenhead.next;
        return oddhead.next;
    }

}
