package niuke_top200.春招.链表;

import java.util.List;

public class ReserveListKGroup {

    public static void main(String[] args) {

        ReserveList.ListNode list = new ReserveList.ListNode(1);

        System.out.println(reserveListKGroup(list,2).toString());
    }



    private static ReserveList.ListNode reserveListKGroup(ReserveList.ListNode list, int k) {
        ReserveList.ListNode head = list;
        ReserveList.ListNode tail = list;

        for (int i = 0; i < k; i++) {
            if(tail == null) return head;
            tail = tail.next;
        }
        ReserveList.ListNode newHead = reserveList(head,tail);
        head.next = reserveListKGroup(tail, k);
        return newHead;
    }

    private static ReserveList.ListNode reserveList(ReserveList.ListNode head, ReserveList.ListNode tail) {
        ReserveList.ListNode pre = null;
        ReserveList.ListNode curr = head;

        while(curr != tail){
            ReserveList.ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;

    }


}
