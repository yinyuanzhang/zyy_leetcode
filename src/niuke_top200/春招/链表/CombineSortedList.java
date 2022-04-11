package niuke_top200.春招.链表;


/*合并有序链表    o(n+m)*/

public class CombineSortedList {

    public static void main(String[] args) {
        ReserveList.ListNode l1 = new ReserveList.ListNode(1);
        ReserveList.ListNode l2 = new ReserveList.ListNode(2);
        ReserveList.ListNode l3 = new ReserveList.ListNode(3);
        ReserveList.ListNode l4 = new ReserveList.ListNode(4);
        l1.next = l3;
        l2.next = l4;
        System.out.println(combineSortedList(l1,l2).toString());
    }


    // 递归解决  o(n + m)
    private static ReserveList.ListNode combineSortedList
            (ReserveList.ListNode l1, ReserveList.ListNode l2) {
        if(l1 == null) return l2;
        else if(l2 == null) return l1;

        if(l1.val > l2.val){
            l2.next = combineSortedList(l1, l2.next);
            return l2;
        }else{
            l1.next = combineSortedList(l1.next, l2);
            return l1;
        }
    }

}

