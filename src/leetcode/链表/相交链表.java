package leetcode.链表;

import publicnode.BulidList;
import publicnode.ListNode;

public class 相交链表 {
    public static void main(String[] args) {
        getIntersectionNode(BulidList.getLIst(3),BulidList.getLIst(5));
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //双指正法
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            System.out.println(a==null?"Achangge":a.val);
            a = a != null ? a.next : headB;
            System.out.println(b==null?"Bchangge":b.val);
            b = b != null ? b.next : headA;
        }
        return a;
    }
}
