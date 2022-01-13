package niuke_top200.剑指offer.lee40_45;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class minK {


    public static void main(String[] args) {

    }


    public int[] minK(int[] arr, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int[] result = new int[k];
        // 这里对k==0必需判断。
        if(k == 0) return result;
        for (int i = 0; i < k; i++) {
            queue.offer(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if(arr[i] < queue.peek()){
                queue.poll();
                queue.offer(arr[i]);
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }
}
