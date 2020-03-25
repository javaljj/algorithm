package leetcode.链表;

import publicnode.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 合并K个排序链表 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode tmpNode = lists[i];
            while (tmpNode != null) {
                list.add(tmpNode.val);
                tmpNode = tmpNode.next;
            }
        }
        Collections.sort(list);
        ListNode pre = null;
        for (int i = 0; i < list.size(); i++) {

            ListNode tmp = new ListNode(list.get(i));
            if (dummy.next == null) {
                dummy.next = tmp;
                pre = tmp;
            } else {
                pre.next = tmp;
                pre = tmp;
            }

        }
        return dummy.next;
    }
}
