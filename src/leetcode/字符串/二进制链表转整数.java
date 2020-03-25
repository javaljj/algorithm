package leetcode.字符串;

import publicnode.ListNode;

public class 二进制链表转整数 {

    public int getDecimalValue(ListNode head) {

        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        int sum = 0;
        curr = head;
        while (curr != null) {
            count--;
            if (curr.val == 1)
                sum += Math.pow(2, count);
            curr = curr.next;
        }
        return sum;

    }
}
