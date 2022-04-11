package niuke_top200.春招.链表;

import java.util.ArrayList;

// 合并两个有序链表的升级版本  归并排序的方式选择两两组合   时间复杂度：klogk*n

public class CombineKSortedList {

    public static void main(String[] args) {

    }

    public static ReserveList.ListNode combineKSortedList(ArrayList<ReserveList.ListNode> lists){
        if(lists == null || lists.size() == 0) return null;
        ReserveList.ListNode result = mergeLists(lists, 0, lists.size() - 1);
        return result;
    }

    private static ReserveList.ListNode mergeLists(ArrayList<ReserveList.ListNode> lists, int left, int right) {
        if(left >= right) return lists.get(left);

        int middle = left + (right - left)/2;
        ReserveList.ListNode l1 = mergeLists(lists, left, middle);
        ReserveList.ListNode l2 = mergeLists(lists, middle + 1, right);
        return mergeTwoLists(l1, l2);

    }


    private static ReserveList.ListNode mergeTwoLists(ReserveList.ListNode l1, ReserveList.ListNode l2) {
        if(l1 == null) return l2;
        else if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }
}
