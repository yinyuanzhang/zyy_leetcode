package niuke_top200.链表;

import java.util.List;

public class ReserveListKGroup_02 {

    public static class ListNode{
        int val;
        ListNode next = null;
        public  ListNode(int val){
            this.val = val;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        System.out.println(reserveKGroup(l1, 3));
    }

    private static ListNode reserveKGroup(ListNode l1, int k) {
        if (l1==null || l1.next == null) return l1;
        ListNode head = l1;
        ListNode tail = l1;

        for (int i = 0; i < k; i++){
            if(tail == null) return head;
            tail = tail.next;
        }
        ListNode newHead = reserveList(head, tail);
        head.next = reserveKGroup(tail, k);
        return newHead;
    }

    private static ListNode reserveList(ListNode head, ListNode tail) {
        return new ListNode(2);
    }

}
