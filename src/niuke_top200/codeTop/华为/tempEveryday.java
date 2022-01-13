package niuke_top200.codeTop.华为;

import java.util.Deque;
import java.util.LinkedList;

public class tempEveryday {

    public static void main(String[] args) {

    }


    public int[] tempEveryday(int[] temps){
        int[] res = new int[temps.length];
        Deque<Integer> stack = new LinkedList<>();

        // stack存储的是索引号
        for (int i = 0; i < temps.length; i++) {
            while(!stack.isEmpty() && temps[i] > temps[stack.peek()]){
                int element = stack.poll();
                res[element] = i - element;
            }
            stack.push(i);
        }
        return res;
    }
}
