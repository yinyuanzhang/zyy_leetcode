package niuke_top200.链表;

public class HasCircle_04 {

    public class ListNode{
        int val;
        ListNode next = null;
        public ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }

    public boolean hasCircle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
