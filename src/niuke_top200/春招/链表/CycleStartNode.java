package niuke_top200.春招.链表;

public class CycleStartNode {

    public static void main(String[] args) {

    }

    public static ReserveList.ListNode cycleStartNode(ReserveList.ListNode list){

        ReserveList.ListNode slow = list;
        ReserveList.ListNode fast = list;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast.next = fast.next.next;
            if(fast == slow) break;
        }

        // 判断无环的情况
        if(fast == null || fast.next == null) return null;

        fast = list;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}

