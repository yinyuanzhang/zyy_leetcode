package niuke_top200.链表;

// 合并链表  新建一个链表

public class MergeList_33 {


    public class ListNode{
        int val;
        ListNode next = null;
        public ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }

    public ListNode mergeList(ListNode l1, ListNode l2){
        ListNode curr = new ListNode(0);
        ListNode res =curr;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = new ListNode(l1.val);
//                换成l1 空间复杂度从 o(n) 到 o（1）
                l1 = l1.next;
            }else{
                curr.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = (l1 == null) ? l2: l1;
        return res.next;
    }

}
