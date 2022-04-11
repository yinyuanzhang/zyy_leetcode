package niuke_top200.春招.链表;

public class FirstCommonList {


    public static void main(String[] args) {
        ReserveList.ListNode l1  = new ReserveList.ListNode(1);
        ReserveList.ListNode l2  = new ReserveList.ListNode(2);
        ReserveList.ListNode l3  = new ReserveList.ListNode(3);
        ReserveList.ListNode l4  = new ReserveList.ListNode(4);
        ReserveList.ListNode l5  = new ReserveList.ListNode(5);
        l1.next = l4;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        System.out.println(firstCommonList(l1, l2).toString());
    }

    private static ReserveList.ListNode firstCommonList(ReserveList.ListNode l1, ReserveList.ListNode l2) {

        ReserveList.ListNode A = l1;
        ReserveList.ListNode B = l2;
        while(A != B){
            A = A == null ? l2 : A.next;
            B = B == null ? l1 : B.next;
        }
        return A;
        
    }
}
