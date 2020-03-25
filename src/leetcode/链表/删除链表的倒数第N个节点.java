package leetcode.链表;

import publicnode.ListNode;

public class 删除链表的倒数第N个节点 {

    public static void main(String[] args) {
        ListNode dummy = new ListNode(-1);
        ListNode point = new ListNode(-1);
        for (int i =1; i <5; i++) {
            ListNode tmp = new ListNode(i);
            if (dummy.next == null) {
                dummy.next = tmp;
                point.next=tmp;
            }else {
                point.next.next = tmp;
                point.next = tmp;
            }

        }
        System.out.println( removeNthFromEnd(dummy.next,2));

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //先走n步的指针
        ListNode fastNode = new ListNode(-1);
        //后奏指针
        ListNode slowNode =  new ListNode(-1);
        //复制一份链表
        ListNode copy = head;
        //先走n步
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        for (int i = 0; i < n; i++) {
            copy = copy.next;
        }

        //快指针直接到达末尾
        if (copy == null) {
            dummy.next = head.next;
        }

        //一起往前走
        while (copy != null) {
            slowNode.next = head;
            fastNode.next = copy;

            head = head.next;
            copy = copy.next;
        }
        if (slowNode.next != null && slowNode.next.next != null) {
            slowNode.next.next = slowNode.next.next.next;
        }


        return dummy.next;


    }
}
