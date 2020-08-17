package com.voken.javaals;

public class RevertList {
    public class ListNode{
        int value;
        ListNode next;
        ListNode(int x){
            value = x;
        }
    }

    public static ListNode RevertList1(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;
        while(cur != null){
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return cur;
    }

    public static ListNode RevertList2(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmp = head;
        ListNode cur = RevertList2(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
