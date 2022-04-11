package niuke_top200.春招.栈与队列;

import java.util.Deque;
import java.util.LinkedList;


// 两个栈实现队列  天然好理解[栈一正一反即可]
public class QueueByTwoStack {


    public static void main(String[] args) {

    }


    public class MyQueue{
        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new LinkedList<>();

        public void offer(int val){
            deque1.push(val);
        }

        public int poll(){
            if(deque2.size() > 0) return deque2.poll();
            while(deque1.size() > 0){
                deque2.push(deque1.poll());
            }
            return deque2.poll();
        }

    }



}
