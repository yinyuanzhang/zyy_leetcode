package niuke_top200.剑指offer.lee30_33;

import java.util.Deque;
import java.util.LinkedList;

public class stackInOut {

    public static void main(String[] args) {

    }

    public boolean stackInOut(int[] pushed, int[] popped){
        Deque<Integer> stack = new LinkedList<>();
        int curr = 0;

        for(int i = 0; i < pushed.length; i++){
            stack.push(pushed[i]);
            while(stack.size() > 0 && stack.peek() == popped[curr]){
                stack.poll();
                curr++;
            }
        }
//第一种方法： 继续模拟
//        while(stack.size() > 0){
//            if(stack.poll() != poped[curr++]){
//                return false;
//            }
//        }
//        return true;
        return stack.isEmpty();
    }
}
