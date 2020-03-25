package leetcode.链表;

import publicnode.BulidList;
import publicnode.ListNode;

public class 分隔链表 {

    public static void main(String[] args) {
        ListNode listNode = BulidList.getLIst(5);
        splitListToParts(listNode, 3);

    }

    public static ListNode[] splitListToParts(ListNode root, int k) {
        int n = 0;
        ListNode curr = root;
        //计算链表长度
        while (curr != null) {
            n++;
            curr = curr.next;
        }
        ListNode[] listNodes = new ListNode[k];
        curr = root;
        if (n <= k) {
            for (int i = 0; i < n; i++) {
                listNodes[i] = curr;
                curr = curr.next;
                if (listNodes[i] != null)
                    listNodes[i].next = null;
            }
            return listNodes;
        }
        //每个节点分配数量
        int every = n / k;
        //余下的节点
        int leave = n % k;

        for (int i = 0; i < k; i++) {
            listNodes[i] = curr;
            //每个节点的数量
            int length;
            if (leave > 0) {
                length = every + 1;
            } else {
                length = every;
            }
            ListNode tmp = listNodes[i];
            for (int j = 0; j < length - 1; j++) {
                tmp = tmp.next;
                curr = curr.next;
            }
            curr = curr.next;
            tmp.next = null;
            leave--;

        }
        return listNodes;
    }
}
