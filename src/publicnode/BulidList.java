package publicnode;

public class BulidList {

    public static ListNode getLIst(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode point = new ListNode(-1);
        for (int i = 1; i < n; i++) {
            ListNode tmp = new ListNode(i);
            if (dummy.next == null) {
                dummy.next = tmp;
                point.next = tmp;
            } else {
                point.next.next = tmp;
                point.next = tmp;
            }

        }
        return dummy.next;
    }


    public static ListNode getLIst(int[] values) {
        ListNode dummy = new ListNode(-1);
        ListNode point = new ListNode(-1);
        for (int i = 0; i < values.length; i++) {
            ListNode tmp = new ListNode(values[i]);
            if (dummy.next == null) {
                dummy.next = tmp;
                point.next = tmp;
            } else {
                point.next.next = tmp;
                point.next = tmp;
            }

        }
        return dummy.next;
    }
}
