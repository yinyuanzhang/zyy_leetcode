package niuke_top200.春招.链表;


//  记得断开链表，断开是因为在合并的时候有影响；
//  合并是在单独的时候合并，所以做处理就好了。
//  合并的时候一定要注意，并不一定是start和middle是首元素了，他们已经排序了
//        mergeList(head, middle);
//        mergeList(secondHead, end);
//        return combineList(head, secondHead);   所以这种写法是错误的
//        return combineList(mergeList(start, middle), mergeList(middle, end));   这才是真正正确的写法



public class SortedList {

    public static void main(String[] args) {

    }

    public ReserveList.ListNode sortedList(ReserveList.ListNode list){
        return mergeList(list, null);
    }
    
    public ReserveList.ListNode mergeList(ReserveList.ListNode start, ReserveList.ListNode end){
        if(start == null || start.next == null) return start;
        ReserveList.ListNode head = start;
        ReserveList.ListNode middle = gainMiddleNode(start, end);
        ReserveList.ListNode secondHead = middle.next;
        mergeList(head, middle);
        mergeList(secondHead, end);
        return combineList(head, secondHead);
    }

    private ReserveList.ListNode gainMiddleNode(ReserveList.ListNode list, ReserveList.ListNode end) {
        ReserveList.ListNode fast = list;
        ReserveList.ListNode slow = list;
        while(fast!= end && fast.next != end){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ReserveList.ListNode combineList(ReserveList.ListNode list1, ReserveList.ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val < list2.val){
            list1.next = combineList(list1.next, list2);
            return list1;
        }else{
            list2.next = combineList(list1, list2.next);
            return list2;
        }
    }
}
