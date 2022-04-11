package niuke_top200.春招.链表;

public class DeleteEndKNode {

    public static void main(String[] args) {

    }


    // 双指针 + pre指针解决删除头结点的问题
    public static ReserveList.ListNode deleteEndKNode(ReserveList.ListNode list, int k){
        ReserveList.ListNode pre = new ReserveList.ListNode(0);
        pre.next = list;
        ReserveList.ListNode slow = pre;
        ReserveList.ListNode fast = list;

        while(fast != null && k > 0){
            fast = fast.next;
            k--;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return pre.next;
    }


    // 这种写法不方便，需要考虑特殊因素，而且两次遍历，不建议
    public static ReserveList.ListNode deleteEndKNode2(ReserveList.ListNode list, int k){

        int length = 0;
        ReserveList.ListNode lengthNode = list;
        ReserveList.ListNode curr = list;
        while(lengthNode != null){
            length++;
            lengthNode = lengthNode.next;
        }

        // 特殊情况，o——>o——>o  如果第一个o没有，根本无法到达第一个o
        if(length - k == 0) return list.next;

        int i = 1;
        while(i != length - k){
            i++;
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return list;
    }
}


