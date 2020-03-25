package leetcode.链表;

import publicnode.BulidList;
import publicnode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class 回文链表 {

    public static void main(String[] args) {
        isPalindrome(BulidList.getLIst(new int[]{1, 1, 2, 1}));
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> ll = new ArrayList<>();

        while (head != null) {
            ll.add(head.val);
            head = head.next;
        }

        int l = 0,
                r = ll.size() - 1;

        while (l <= r) {

            if(ll.get(l).intValue() != ll.get(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;

    }
}
