package leetcode.链表;

import publicnode.BulidList;
import publicnode.ListNode;

public class 对链表进行插入排序 {

    public static void main(String[] args) {
        insertionSortList(BulidList.getLIst(new int[]{4, 2, 1, 3}));
    }

    public static ListNode insertionSortList(ListNode head) {

        ListNode dummy = new ListNode(-1);
        ListNode pre;
        while (head != null) {
            //到头结点
            pre = dummy;
            ListNode curr = head;
            head = head.next;
            //断开与老链表的联系
            curr.next = null;
            //遍历新链表
            while (pre.next != null) {
                //相当于判断+插入的操作
                if (pre.next.val > curr.val) {
                    ListNode tmp = pre.next;
                    pre.next = curr;
                    curr.next = tmp;
                    break;
                }
                pre = pre.next;
            }
            //如果到尾结点还没有插入，就把当前节点查到最后面
            if (pre.next == null) {
                pre.next = curr;
            }
        }
        return dummy.next;
    }

}
