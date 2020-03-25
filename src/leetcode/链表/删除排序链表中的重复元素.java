package leetcode.链表;

import publicnode.BulidList;
import publicnode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class 删除排序链表中的重复元素 {

    public static void main(String[] args) {
        deleteDuplicates(BulidList.getLIst(new int[]{1, 1, 2, 3, 3}));
    }


    //思路：找到就放set。
    public static ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = new ListNode(-1);
        ListNode fast = new ListNode(-1);

        set.add(head.val);
        while (head != null) {



        }
        return dummy.next;

    }

}
