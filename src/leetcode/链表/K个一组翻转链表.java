package leetcode.链表;

import publicnode.BulidList;
import publicnode.ListNode;

public class K个一组翻转链表 {

    public static void main(String[] args) {

        reverseKGroup(BulidList.getLIst(6), 3);
    }

    public static ListNode reverseKGroup(ListNode head, int k) {

        int zu = 0;
        ListNode curr = head;
        while (curr != null) {
            zu++;
            curr = curr.next;
        }
        //组数
        zu = zu / k;

        ListNode dummy = new ListNode(-1);

        dummy.next = head;
        //上一个尾结点，用来连接翻转连表的
        ListNode pointpre = dummy;
        //用来计数组数量的
        while (zu > 0) {
            //每组的个数
            int tmp = k;
            //第一个头结点，最终会跑到最后一个
            ListNode point = pointpre.next;
            //翻转连表， 因为第一个节点不算，所以需要减一
            while (tmp - 1 > 0) {
                //换位置的节点
                ListNode changeNode = point.next;
                //最后一个节点 连接到交换节点的后一个
                point.next = changeNode.next;
                //交换节点的下一个就是 当前反转数量的第一个节点
                changeNode.next = pointpre.next;
                //上个尾巴指针指向 修改过的节点
                pointpre.next = changeNode;
                //节点数量减1
                tmp--;
            }
            //一组反转完成，把前节点的指针指向当前最后一个节点
            pointpre = point;
            //组数 -1
            zu--;
        }

        return dummy.next;
    }
}
