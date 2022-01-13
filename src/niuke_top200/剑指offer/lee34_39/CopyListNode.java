package niuke_top200.剑指offer.lee34_39;

import java.util.HashMap;

public class CopyListNode {

    public static void main(String[] args) {

    }

    public class Node{
        int val;
        Node next = null;
        Node random = null;

        public Node(int val){
            this.val = val;
        }
    }

    public Node copyListNode(Node head){
        if(head == null) return head;
        Node old = head;
        HashMap<Node, Node> map = new HashMap<>();

        while(old != null){
            Node node = new Node(old.val);
            map.put(old, node);
            old = old.next;
        }
        old = head;
        while(old != null){
            Node next = old.next;
            Node random = old.random;
            map.get(old).next = map.get(next);
            map.get(old).random = map.get(random);
            old = old.next;
        }
        return map.get(head);
    }
}

// 最好加一下判空处理