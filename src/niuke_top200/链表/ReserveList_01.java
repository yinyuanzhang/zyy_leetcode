package niuke_top200.链表;

//1. 翻转链表
//迭代法：既然是单链表，从第一步就开始解决所有的next

public class ReserveList_01 {

    public static class ListNode{
        int val;
        ListNode next = null;

        ListNode(int val){
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
        ListNode listnode = new ListNode(1);
        ListNode listnode2 = new ListNode(2);
        ListNode listnode3 = new ListNode(3);
        listnode.next = listnode2;
        listnode2.next = listnode3;

//        System.out.println(reserveList(listnode).toString());
        System.out.println(reserveList2(listnode).toString());
    }

    public static ListNode reserveList(ListNode listnode){
        if(listnode == null || listnode.next == null) return listnode;

        ListNode nextNode = listnode.next;
        ListNode reserve = reserveList(listnode.next);
        nextNode.next = listnode;
        listnode.next = null;
        return reserve;

    }

    public static ListNode reserveList2(ListNode listnode){
        ListNode curr = listnode;
        ListNode pre = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}


