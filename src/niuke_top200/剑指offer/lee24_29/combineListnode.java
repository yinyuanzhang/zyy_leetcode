package niuke_top200.剑指offer.lee24_29;

import java.util.List;

public class combineListnode {

    public static void main(String[] args) {

    }

    public class ListNode{
        int val;
        ListNode next = null;
        public ListNode(int val){
            this.val = val;
        }
    }

    public ListNode combineListnode(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val <= l2.val){
            l1.next = combineListnode(l1.next, l2);
            return l1;
        }else {
            l2.next = combineListnode(l1, l2.next);
            return l2;
        }
    }
}
