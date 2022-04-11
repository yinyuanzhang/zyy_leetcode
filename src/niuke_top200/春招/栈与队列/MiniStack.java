package niuke_top200.春招.栈与队列;

import java.util.Deque;
import java.util.LinkedList;



//  最小/最大函数栈：新增辅助栈，且辅助栈一定要与normal栈相对应。 注意比较关系不要弄反了
public class MiniStack {

    public static void main(String[] args) {

    }


    public class MyStack{
        Deque<Integer> normalStack = new LinkedList<>();
        Deque<Integer> miniStack = new LinkedList<>();

        public void push(int val){
            normalStack.push(val);
            if(miniStack.size() == 0 || miniStack.peek() > val) miniStack.push(val);
            else miniStack.push(miniStack.peek());
        }

        public void pop(){
            normalStack.poll();
            miniStack.poll();
        }

        public int peek(){
            return normalStack.peek();
        }

        public int mini(){
            return miniStack.peek();
        }

    }
}
