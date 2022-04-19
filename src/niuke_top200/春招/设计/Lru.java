package niuke_top200.春招.设计;


import java.util.HashMap;

//双向链表 + 哈希表
public class Lru {

    public class DlinkedList{
        int key;
        int val;
        DlinkedList pre;
        DlinkedList next;

        public DlinkedList(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    int cap;
    int size;
    DlinkedList head;
    DlinkedList tail;
    public Lru(int cap){
        head = new DlinkedList(0, 0);
        tail = new DlinkedList(0, 0);
        head.next = tail;
        tail.pre = head;
        this.cap = cap;
        this.size = 0;
    }

    HashMap<Integer, DlinkedList> map = new HashMap<>();
    public int get(int key){
        DlinkedList node = map.get(key);
        if(node == null) return -1;
        else{
            removeNode(node);   // 漏掉了
            moveToHead(node);
            return node.val;
        }
    }

    public void set(int key, int val){
        DlinkedList node = map.get(key);
        DlinkedList newNode = new DlinkedList(key, val);
        if(node != null){
            removeNode(node);
            moveToHead(newNode);
            map.put(key, newNode);
        }else{
            size++;
            if(size <= cap){
                moveToHead(newNode);
                map.put(key, newNode);
            }else{
                removeNode(tail.pre);
                map.remove(tail.pre.key);   // 漏掉了
                size--;
                moveToHead(newNode);
                map.put(key, newNode);
            }
        }
    }

    private void removeNode(DlinkedList node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }


    private void moveToHead(DlinkedList node) {
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

}
