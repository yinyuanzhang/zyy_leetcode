package niuke_top200.剑指offer.lee24_29;

import niuke_top200.链表.ReserveList_01;

public class reserveListnode {

    public static void main(String[] args) {

    }

    public class ListNode{
        int val;
        ListNode next = null;
        public ListNode(int val){
            this.val = val;
        }
    }

    // 迭代法反转链表
    public ListNode reserveListNode(ListNode head){
        ListNode pre = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = curr.next;
        }
        return pre;
    }
}
