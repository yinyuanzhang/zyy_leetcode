package niuke_top200.剑指offer.lee17_22;

public class deleteListNode {

    public static void main(String[] args) {

    }

    public class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode deleteListNode(ListNode list, int val){
        ListNode result = list;
        if(list == null) return result;
        if(list.val == val) return result.next;

        while(list != null && list.next != null){
            if(list.next.val == val){
                list.next = list.next.next;
                break;
            }
            list = list.next;
        }
        return result;
    }
}
