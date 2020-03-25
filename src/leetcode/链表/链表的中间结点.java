package leetcode.链表;

import publicnode.ListNode;

public class 链表的中间结点 {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }


        count = count / 2 + 1;
        curr = head;
        while (curr != null) {
            if (count == 0) {
                break;
            }
            count--;
            curr = curr.next;
        }

        return curr;


    }

}
