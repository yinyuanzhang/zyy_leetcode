package niuke_top200.春招.栈与队列;

import java.util.LinkedList;
import java.util.Queue;

// 两个队列/一个队列实现栈  [保证已排好的是stack的顺序]
public class StackByTwoQueue {

    public static void main(String[] args) {

    }

    // 每次保证已排好的顺序是stack
    public class MyStackByOneQueue{
        Queue<Integer> queue1 = new LinkedList<>();

        public void push(int val){
            int size = queue1.size();
            queue1.offer(val);
            for (int i = 0; i < size; i++) {
                queue1.offer(queue1.poll());
            }
        }

        public int poll(){
            return queue1.poll();
        }
    }

    // 一个队列保持已排好的顺序是stack
    public class MyStackByTwoQueue{
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        public void push(int val){
            queue2.offer(val);
            while(queue1.size() > 0){
                queue2.offer(queue1.poll());
            }
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }

        public int poll(){
            return queue1.poll();
        }
    }

}
