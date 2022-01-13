package niuke_top200.剑指offer.lee52_55;

public class FirstCommonList {


    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }

    public ListNode firstCommonList(ListNode l1, ListNode l2){
        ListNode A = l1;
        ListNode B = l2;

        while(A != B){
            A = A.next == null ? l2 : A.next;
            B = B.next == null ? l1 : B.next;
        }
        return A;
    }
}

//   错误写法
//   A = A.next == null ? l2 : A.next;
//   B = B.next == null ? l1 : B.next;
