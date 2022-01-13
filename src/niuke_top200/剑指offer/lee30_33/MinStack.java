package niuke_top200.剑指offer.lee30_33;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {

    public static void main(String[] args) {

    }

    Deque<Integer> A;
    Deque<Integer> B;

    public MinStack(){
        A = new LinkedList<>();
        B  = new LinkedList<>();
    }

    public void push(int x){
        A.push(x);
        if(B.isEmpty() || B.pop() < x){
            B.push(x);
        }
    }

    // 这里没有使用==，因为stack存储的Integer类，==会比较地址，equals会比较值。
    public void pop(){
        if(A.poll().equals(B.peek())){
            B.poll();
        }
    }

    public int top(){
        return A.poll();
    }

    public int min(){
        return B.poll();
    }

}
