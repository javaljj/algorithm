package leetcode.链表;

import publicnode.BulidList;
import publicnode.ListNode;

public class 两两交换链表中的节点 {

    public static void main(String[] args) {
        ListNode treeNode = BulidList.getLIst(6);
        swapPairs(treeNode);
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;

        if (head.next == null)
            return head;

        ListNode dummy = new ListNode(-1);
//        //指向第二个节点
//        dummy.next = head.next;


        ListNode point = dummy;
        while (head != null && head.next != null) {

            ListNode first = head;
            ListNode second = head.next;
            //交换节点
//            if (point == null) {
//                first.next = second.next;
//                second.next = first;
//            } else {
                point.next = second;
                first.next = second.next;
                second.next = first;
//            }

            point = first;
            head = head.next;

        }

        return dummy.next;
    }

    public void swap连表() {

    }

}
