package niuke_top200.春招.链表;

public class ReserveList {

    public static class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        System.out.println(reserveList(l1).toString());
        System.out.println(reserveList(l3).toString());
    }

    private static ListNode reserveList(ListNode curr) {
        ListNode pre = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    private static ListNode reserveList2(ListNode l) {
        if(l == null || l.next == null) return l;

        ListNode nextNode = l.next;
        ListNode reserveNextNode = reserveList2(nextNode);
        reserveNextNode.next = l;
        l.next = null;
        return reserveNextNode;
    }

}
