package niuke_top200.春招.链表;

public class HasCycle {


    public static void main(String[] args) {



    }


    public static boolean hasCycle(ReserveList.ListNode list){
        ReserveList.ListNode slow = list;
        ReserveList.ListNode fast = list;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;

    }
}
