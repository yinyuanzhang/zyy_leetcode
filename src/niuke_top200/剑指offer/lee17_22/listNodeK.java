package niuke_top200.剑指offer.lee17_22;

import java.util.List;

public class listNodeK {

    public static void main(String[] args) {

    }

    public class ListNode{
        int val;
        ListNode next = null;
        public ListNode(int val){
            this.val = val;
        }
    }

    public ListNode listNodeK(ListNode list, int k){

        ListNode lengthList = list;
        int length = 0;
        while(lengthList != null){
            length++;
            lengthList = lengthList.next;
        }

        int order = length - k + 1;
        for (int i = 1; i < order; i++) {
            list = list.next;
        }
        return list;
    }
}
