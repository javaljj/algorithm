package jzoffer;

import publicnode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class 从尾到头打印链表 {

    public int[] reversePrint(ListNode head) {

        List<Integer> list = new ArrayList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(list.size() - 1 - i);
        }


        return ans;
    }
}
