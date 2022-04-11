package niuke_top200.春招.链表;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

//  堆栈 + 大数相加  o(max(m,n))   时间：o(m+n) 堆栈
public class AddInList {

    public static void main(String[] args) {


    }

    public static ReserveList.ListNode addInList(ReserveList.ListNode l1, ReserveList.ListNode l2){
        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new LinkedList<>();
        while(l1 != null){
            deque1.offer(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            deque2.offer(l2.val);
            l2 = l2.next;
        }

        int tag = 0;
        ReserveList.ListNode result = new ReserveList.ListNode(0);
        while(deque1.size() > 0 || deque2.size() > 0 || tag > 0){
            int a = deque1.isEmpty() ? 0 : deque1.pop();
            int b = deque2.isEmpty() ? 0 : deque2.pop();
            int curr = a + b + tag;
            tag = curr/10;
            curr %= 10;
            ReserveList.ListNode currNode = new ReserveList.ListNode(curr);
            currNode.next = result;
            result = currNode;
        }
        return result;

    }
}
