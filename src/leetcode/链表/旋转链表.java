package leetcode.链表;

import publicnode.BulidList;
import publicnode.ListNode;

public class 旋转链表 {

    public static void main(String[] args) {
        rotateRight(BulidList.getLIst(6), 7);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int len = 0;
        //建立环
        while (head != null) {
            len++;
            if (head.next == null) {
                head.next = dummy.next;
                break;
            }
            head = head.next;
        }
        head = dummy.next;
        if (len >= k) {
            k = k + 1;
        }
        while (k > 0) {
            k--;
            head = head.next;
        }
        ListNode ans = head.next;
        head.next = null;
        return ans;
    }

}
