package leetcode.链表;

import publicnode.ListNode;

public class MyLinkedList {

    public ListNode head;

    public ListNode tail;

    public int length = 0;


    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
//        l.addAtHead(7);
//        l.addAtHead(2);
//        l.addAtHead(1);
//        l.addAtIndex(3, 0);
//        l.deleteAtIndex(2);
//        l.addAtHead(6);
//        l.addAtTail(4);
//        l.get(4);
//        l.addAtHead(4);
//        l.addAtIndex(5, 0);
//        l.addAtHead(6);
        l.addAtIndex(0, 10);
        l.addAtIndex(0, 20);
        l.addAtIndex(1, 30);
        System.out.println(l.get(0));
    }

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index >= length || index < 0)
            return -1;
        ListNode curr = head;
        while (curr != null) {

            if (index == 0)
                return curr.val;

            index--;
            curr = curr.next;
        }
        return curr.val;

    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        length++;
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }

    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        length++;
        ListNode node = new ListNode(val);
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > length)
            return;

        ListNode node = new ListNode(val);

        if (head == null) {
            head = node;
            tail = node;
            length++;
            return;
        }

        if (length == index) {
            tail.next = node;
            tail = node;
            length++;
            return;
        }

        //头部
        if (index == 0) {
            node.next = head;
            head = node;

            length++;
            return;
        }

        ListNode curr = head;
        while (index - 1 > 0) {
            curr = curr.next;
            index--;
        }
        //添加节点
        node.next = curr.next;
        curr.next = node;
        //值换一下
        length++;

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= length || index < 0)
            return;


        //头结点和尾结点在一起
        if (head == tail) {
            head = null;
            tail = null;
            length--;
            return;
        }

        if (index == 0) {
            head = head.next;
            length--;
            return;
        }
        ListNode curr = head;
        while (index - 1 > 0) {
            curr = curr.next;
            index--;
        }
        //删除节点
        if (curr.next == tail) {
            tail = curr;
        } else {
            curr.next = curr.next.next;
        }
        length--;

    }
}
